#/bin/bash

fun 
netconf故障排查：
1：集群
    重点关注：
       搜索  is not unique ,此项检查是否有actor重名，actor重名可能导致链接失败，mountpoint挂在失败等现象

     重点关注：OneForOneStrategy


    现象：设备链接失败（关注设备使能，路由等是否正常）（所有搜索建议使用grep -rni   不区别大小写）
         1：搜索 is not unique ，检查是否有actor重名

         2：搜索 Starting SSH to ，是否有建立链接，并获取链接所使用的channel

         3：搜索第二步所使用的channel，查看流程

             日志打印：Session NetconfClientSession{sessionId=169, channel=[id: 0x7b23da09]} up

         4：搜索 Session established
             日志打印：RemoteDevice{test2}: Session established

          5：以上只能保证建联成功过，还需查看之后是否有断链，此项还是要查看第二步骤所以用的channel是否最终被关闭


    现象：topo库状态显示不正确 （此项检查较为复杂，由于netconf多采用异步，很多地方不能保证时序问题，此处记录一个已知的现象）

         案例：1000个设备节点同时断线，topo库显示netconf断链connecting，但是随后处于connecting设备的数量减少，多数设备状态显示不正常
         原因：设备锻炼时，控制器的三个节点与设备断链时间有先后差异，此时会触发ClusteredNetconfDevice.onRoleChange流程，在经历一系列操作后，
              会触发通知NetconfNodeManagerCallback.onDeviceConnected流程（此过程将自身设备的链接状态修改为connected），触发
              BaseTopologyManager.notifyNodeStatusChange，此操作会重新捞取设备状态，并写库

              由于异步时序问题，onRoleChange流程先触发，后完成，NetconfNodeManagerCallback.onDeviceDisconnected后触发先完成，导致库中状态不对

         1：BaseTopologyManager.notifyNodeStatusChange 的日志打印

         2：NetconfNodeManagerCallback 当中对应的函数的日志打印


    现象：节点创建，删除，更新等操作出现问题

         1:TopologyRoleChangeStrategy.onDataTreeChanged 当中日志打印,此处为集群中监听数据库改变的起始点，并关注config库是否有数据存在


    现象：config数据删除，但是operational库仍然存在数据

         1：关注TopologyRoleChangeStrategy.onDataTreeChanged 是否监听到config库删除数据
            可搜索：Data was Deleted

         2：关注BaseTopologyManager.onNodeDeleted，重点捞取状态的future聚合是否成功，如果失败，可能导致topo库不更新，即operational数据残留





单节点：
      单节点topo库的监听NetconfTopologyImpl.onDataTreeChanged 可以从这里向后查看
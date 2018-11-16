package MyTest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;

@Setter
@Getter
public class MyBeanFactory implements FactoryBean<MyBean> {
    String myBeanName;

    public MyBean getObject() throws Exception {
        MyBean myBean = new MyBean();
        myBean.setMyBeanName(myBeanName);
        return myBean;
    }

    public Class<MyBean> getObjectType() {
        return MyBean.class;
    }

    /*控制getBean是否为同一对象*/
    public boolean isSingleton() {
        return true;
    }
}



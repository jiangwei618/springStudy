import MvcTest.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(locations = {"classpath:spring-servlet.xml"})
public class UserTest {
//    @Autowired
//    UserController userController;
//
//    @Autowired
//    private WebApplicationContext wac;
//
//    @Autowired
//    SimpleUrlHandlerMapping simpleUrlMapping;
//
//
//    @Autowired
//    SimpleUrlHandlerMapping simpleUrlHandlerMapping;

    //    MockMvc mockMvc;
//
    float a;
    String s;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
//    }
//
//    @Test
//    public void temp() throws Exception {
//        System.out.println(userController);
//        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post("/user.html"));
//        MvcResult mvcResult = resultActions.andReturn();
//        String result = null;
//        result = mvcResult.getResponse().getContentAsString();
//        System.out.println("=====客户端获得反馈数据:" + result);
//        // 也可以从response里面取状态码，header,cookies... //
//        System.out.println(mvcResult.getResponse().getStatus());
//    }

    @Test
    public void tem2p() throws Exception {
        int []a = {1,5,4,2,10,7};
        sort(a,a.length);
    }

    public  void sort(int[] a , int  n ){
        if (n <= 1){
            return;
        }
        for (int i =0; i< n;i++){
            for (int j =0;j< n- i -1;j++){
                if (a[j] < a[j+1] ){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a [j+1] = temp;
                }

                for (int ij=0;ij<n;ij++){
                    System.out.println(a[ij]);
                }
                System.out.println();

            }
        }


    }

    public class te {
        te(String string) {
        }
    }

    public class temp extends te {

        temp(String string) {
            super(string);
        }

        public void   temp() {
        }
    }
}

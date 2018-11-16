import MvcTest.config.WebConfig;
import MvcTest.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy(@ContextConfiguration(classes = WebConfig.class))
public class UserTest {
    @Autowired
    UserController userController;
    @Autowired
    HandlerInterceptor myInterceptor;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        String[] pattern = {"/user.html"};
        this.mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).addMappedInterceptors(pattern, myInterceptor).build();
    }

    @Test
    public void temp() throws Exception {
        System.out.println(userController);
        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post("/user.html"));
        MvcResult mvcResult = resultActions.andExpect(status().is(200)).andExpect(view().name("userlist")).andReturn();
        String result = null;
        result = mvcResult.getResponse().getContentAsString();
        System.out.println("=====客户端获得反馈数据:" + result);
        // 也可以从response里面取状态码，header,cookies... //
        System.out.println(mvcResult.getResponse().getStatus());
    }

    static class HeapOOM{}

    @Test
    public void testString() {
        long a = (int) 3.9;
        System.out.println(a);
    }
}

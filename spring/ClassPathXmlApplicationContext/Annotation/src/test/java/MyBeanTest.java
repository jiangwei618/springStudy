import MyTest.Config;
import MyTest.MyBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= Config.class)
public class MyBeanTest {

    @Autowired
    MyBean myBean;

    @Test
    public void testBean(){
        myBean.setName("jw");
        Assert.assertEquals("jw",myBean.getName());
    }
}

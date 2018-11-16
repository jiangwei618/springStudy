import org.junit.Assert;
import org.junit.Test;

public class MyBeanTest {
    @Test
    public void testBean(){
        MyBean myBean = new MyBean();
        myBean.setName("jw");
        Assert.assertEquals("jw",myBean.getName());
    }
}

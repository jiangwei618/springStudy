package MyTest;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MyBeanReplace implements MethodReplacer {

    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("replace");
        return ((MyBean) obj).myBeanName;
    }
}

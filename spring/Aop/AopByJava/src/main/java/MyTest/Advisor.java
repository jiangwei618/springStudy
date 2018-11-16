package MyTest;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Advisor implements MethodBeforeAdvice, AfterReturningAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("method before");
    }

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("method after");
    }
}

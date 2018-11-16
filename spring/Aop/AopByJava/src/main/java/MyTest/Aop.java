package MyTest;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Aop {
    Logger logger = Logger.getLogger(Aop.class);

    @Pointcut("execution(public * getMyBeanName(..))")
    public void pointCut() {

    }

    @Before(value = "pointCut()")
    public void before(){
        logger.info("aop before");
    }

    @After(value = "pointCut()")
    public void after(){
        logger.info("aop after");
    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint pointcut) throws Throwable {
        logger.info("aop around");
        return pointcut.proceed();
    }
}


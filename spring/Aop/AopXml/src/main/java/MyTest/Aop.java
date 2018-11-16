package MyTest;

import org.apache.log4j.Logger;

public class Aop {
    Logger logger = Logger.getLogger(Aop.class);
    public void before(){
        logger.info("aop before");
    }

    public void after(){
        logger.info("aop after");
    }

    public void around(){
        logger.info("aop around");
    }
}


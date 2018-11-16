package MyTest;

import lombok.Getter;

import java.util.Random;

@Getter
public class MyBean {
    int random = (new Random()).nextInt();
    String myBeanName = new String(String.valueOf(random));
}

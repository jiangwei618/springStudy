package MyTest;

import MyTest.myString.String;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyBean {
    String myBeanName;

    public String getMyBeanName() {
        String string = new String();
        string.put();
        return myBeanName;
    }
}

package hello;

import org.joda.time.LocalTime;

/**
 * Created by tr0k on 2014-07-01.
 */
public class HelloWorld {
    public static void main(String[] args){
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}

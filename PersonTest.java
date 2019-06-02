package day09;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Author: Sweetie77
 * Created: 2019/5/29
 */
class Person{
    String name = "no name";
    public Person(String nm){
        name = nm;
    }
}
class Employee extends Person{
    String empID = "0000";
    public Employee(String id){
        super("0000");
        empID = id;
    }
}
public class PersonTest {
    public static void main(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }

}

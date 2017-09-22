package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Laura", new Date(97,11,10));
        System.out.println("Mi nombre es "+ person.getName()+ " y tengo " +person.getAge()+ " años");
    }
    
}

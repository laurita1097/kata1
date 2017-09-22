package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1997, 11, 10);
        Person person = new Person("Laura", date);
        System.out.println("Mi nombre es "+ person.getName()+ " y tengo " +person.getAge()+ " años");
    }
    
}

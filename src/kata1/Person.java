package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person {
    private final String name;
    private final Calendar birthday;
    private static final long MILLISECONS_PER_YEAR =  (long)(1000*60*60*24*365.25);
    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int)(milliSecondsToYears(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
    private long milliSecondsToYears(long milles){
        return milles/MILLISECONS_PER_YEAR;
    }
}


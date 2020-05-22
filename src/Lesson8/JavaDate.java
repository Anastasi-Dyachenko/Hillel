package Lesson8;


import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = new GregorianCalendar(2004,02,02);

        System.out.println(calendar);
        calendar.roll(Calendar.MONTH, -2);
    }
}

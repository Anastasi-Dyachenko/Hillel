package Homework8;



import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date2 {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        Date date = a.parse(b.readLine());

        //LocalDate dateF = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd//MM//yyyy"));
       // System.out.println(dateF.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));

    }
}

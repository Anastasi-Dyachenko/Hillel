package Homework8;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) throws Exception {
        BufferedReader date1 = new BufferedReader(new InputStreamReader(System.in));
        String dateString = "2004-12-13";
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    }
}

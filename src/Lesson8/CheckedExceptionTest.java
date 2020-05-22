package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try{
           reader.readLine();
       }catch (IOException e) {
           throw new RuntimeException(e);
       }
        System.out.println(reader);
    }
    public static void method2() throws RuntimeException{


    }
}

package Homework3;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class Number1 {
    public static void main(String[] args) {
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\Настя\\Гиллель.txt")))
        {
            while (bufferedInputStream.available()>0){
                char ch = (char) bufferedInputStream.read();
                System.out.print(ch);
            }

        } catch (IOException e ) {
            e.printStackTrace();
        }


            }


        }




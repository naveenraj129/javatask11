package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptionfifth {

    public static void main( String[] args){
        try {
            FileReader obj = new FileReader("sample.txt");
            BufferedReader obj1 = new BufferedReader(obj);

            while(obj1.readLine()!=null){
                System.out.println(obj1.readLine());
            }
            obj1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

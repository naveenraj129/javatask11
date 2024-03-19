package org.example;

import java.util.Scanner;

public class ExceptionFirst {

    public static void main(String[] args) {


        Scanner obj = new Scanner(System.in);
        Integer value1 = obj.nextInt();
        Integer value2 = obj.nextInt();

        try {
            float div = (value1 / value2);
            System.out.println(div);
        } catch (ArithmeticException ex) {
            System.out.println("Exception thrown" + ex);
        }

    }
}

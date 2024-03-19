package org.example;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int age = value.nextInt();
        try {
            if (age <= 18) {
                throw new InvalidAgeException("invalid age");
            }else{
                System.out.print("Age is correct");
            }
        }catch(InvalidAgeException a){
            System.out.println("Error: " + a.getMessage());
        }
    }
}

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


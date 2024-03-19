package org.example;

import java.util.Scanner;

public class Exceptionthird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        try {
            if (!inputUsername.equals("admin") || !inputPassword.equals("admin")) {
                throw new IncorrectCredentialsException("Incorrect username or password.");
            } else {
                System.out.println("Login successful!");
            }
        } catch (IncorrectCredentialsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class IncorrectCredentialsException extends Exception {
    public IncorrectCredentialsException(String message) {
        super(message);
    }
}

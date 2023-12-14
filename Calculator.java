package com.javaprogram;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");


        double num1 = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");

        double num2 = scanner.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");

        char operator = scanner.next().charAt(0);
        double result;

        if (operator == '+') {
            result = num1 + num2;

        } else if (operator == '-') {
            result = num1 - num2;

        } else if (operator == '*') {
            result = num1 * num2;

        } else if (operator == '/') {
            if (num2 == 0) {

                System.out.println("Error! Pembagian dengan nol tidak diizinkan.");
                return;
            }
            result = num1 / num2;

        } else {

            System.out.println("Error! Operator tidak valid.");

            return;
        }
        System.out.println("Hasil: " + result);
    }
}

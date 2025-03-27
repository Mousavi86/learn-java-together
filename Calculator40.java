package Calculator40;

import java.util.Scanner;

public class Calculator40 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter first number: ");
            float num1 = (float) s.nextFloat();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = s.next().charAt(0);
            System.out.print("Enter second number: ");
            float num2 = (float) s.nextFloat();
            float result = 0;
            try { if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                result = num1 / num2;
            } else {
                System.out.println("Invalid operator!");
                return;
            }
                System.out.println("Result: " + result);
            }catch (Exception e) {
                System.out.println("Invalid operator!");
            }
        }
    }


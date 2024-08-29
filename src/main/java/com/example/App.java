package com.example;

import java.util.Scanner;

public class App {
  private static CalService calService = new CalService();

  public static void main( String[] args ) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter num1: ");
    int num1 = scan.nextInt();
    System.out.print("Enter num2: ");
    int num2 = scan.nextInt();
    scan.nextLine();
    System.out.print("Enter opt +, -, * or  /: ");
    char opt = scan.nextLine().charAt(0);

    scan.close();

    System.out.println("Result: " + displayResult(num1, num2, opt));
  }

  protected static int displayResult(int a, int b, char opt) {
    return switch (opt) {
        case '+' -> {yield calService.add(a, b);}
        case '-' -> {yield calService.sub(a, b);}
        case '*' -> {yield calService.mul(a, b);}
        case '/' -> {yield calService.div(a, b);}
        default -> {
            System.out.println("Invalid opt");
            yield Integer.MIN_VALUE;
        }
    };
  }
}

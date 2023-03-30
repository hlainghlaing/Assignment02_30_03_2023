package scm.com.ojt.controlstatement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char operatorVar;
        double num1, num2, result;

        // create an object of scanner class
        Scanner sc = new Scanner(System.in);

        // Ask user to choose an operator
        System.out.println("Choose an operator : + , - , * or /");
        operatorVar = sc.next().charAt(0);

        // Ask user to enter numbers
        System.out.println("Enter first number");
        num1 = sc.nextDouble();

        System.out.println("Enter second number");
        num2 = sc.nextDouble();

        switch (operatorVar) {
        case '+':
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
            break;
        case '=':
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
            break;
        case '*':
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
            break;
        case '/':
            result = num1 * num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            break;
        default:
            System.out.println("Invalid Operator");
            break;
        }
    }

}

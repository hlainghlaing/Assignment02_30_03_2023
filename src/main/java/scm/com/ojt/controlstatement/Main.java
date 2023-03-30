package scm.com.ojt.controlstatement;

import java.util.Arrays;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        testSwitchCase();
        testIf();
    }

    public static void testSwitchCase() {
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
        case '-':
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
            break;
        case '*':
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
            break;
        case '/':
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            break;
        default:
            System.out.println("Invalid Operator");
            break;
        }
    }

    public static void testIf() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Ask user to enter percentage of Done
        System.out.println("Enter persentage of project you've done");
        int pc = input.nextInt();

        if (pc == 0) {
            System.out.println("Please Do Assignment. Fighting!");
        } else if (pc > 0 && pc < 50) {
            System.out.println("Good Job: Keep Go on. ");
        } else if (pc > 0 && pc < 100) {
            System.out.println("Great! You already finished hlaf project.");
        } else if (pc > 0 && pc == 100) {
            System.out.println("Great Great! You finish project.");
        } else {
            System.out.println("Invalid Percentage.");
        }
    }

}

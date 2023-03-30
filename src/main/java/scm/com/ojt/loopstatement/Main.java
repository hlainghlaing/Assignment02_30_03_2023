package scm.com.ojt.loopstatement;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of number 0 to 100 : " + add());
        testDoWhile();
    }

    public static int add() {
        int sum = 0;
        int i = 0;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    public static void testDoWhile() {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter count number");
        int count = input.nextInt();
        if (count >= 10) {
            System.out.println("Looping will work input less than 10");
            System.out.println("Input number " + count + " is greater than 10.");
        } else {
            System.out.println("Input number " + count + " is less than 10");
        }

        do {
            System.out.println(count);
            count++;
        } while (count < 10);

    }

}

/*Написати програму на вхід якої подається число N. Потрібно підрахувати суму усіх не парних чисел до N включно.
 Вивести суму та кількість чисел.*/
package task12;

import java.util.Scanner;



public class SumOfOddNumbers {
    private static Scanner input;
    private static int count;
    private static int sum;

    static {
        input = new Scanner(System.in);
        count = 0;
        sum = 0;
    }

    public static void main(String[] args) {
        System.out.print("Enter please number: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i += 2) {
            sum += i;
            count++;
        }
        System.out.println("The sum of odd numbers up to " + number + " is " + sum);
        System.out.println("The number of odd numbers up to " + number + " is " + count);
    }
}

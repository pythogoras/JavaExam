/*Написати програму на вхід якої подається число N. Потрібно підрахувати суму усіх парних чисел до N включно. 
Вивести суму та кількість чисел*/
package task11;

import java.util.Scanner;



public class SumOfEvenNumbers {
    private static Scanner input;
    private static int sum;

    static {
        input = new Scanner(System.in);
        sum = 0;
    }

    public static void main(String[] args) {
        System.out.print("Enter please number: ");
        int number = input.nextInt();
        int count = number / 2;
        for (int i = 2; i <= number; i += 2) {
            sum += i;
        }
        System.out.println("The sum of even numbers up to " + number + " is " + sum);
        System.out.println("The number of even numbers up to " + number + " is " + count);
    }
}

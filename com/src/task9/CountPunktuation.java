/*Написати код, який підраховує кількість символів пунктуації ( , .) у рядку.*/
package task9;

import java.util.Scanner;



public class CountPunktuation {
    private static Scanner input;

    static {
        input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.print("Enter please string: ");
        String str = input.nextLine();
        System.out.println("'.' and ',': " + countPunktuation(str.toCharArray()));
    }

   private static int countPunktuation(char[] charArray) {
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '.' || charArray[i] == ',') {count++;}
        }
        return count;
   } 
}

/*Написати програмний код, який змінює регістр рядка в залежності від кількості символів.
Якщо кількість не парна, то підіймає увесь текст у верхній регістр. 	(ТЕКСТ)
Якщо кількість парна, то опускає увесь текст у нижній регістр.	(тексти)*/
package task10;

import java.util.Scanner;



public class ChangeCase {
    private static Scanner input;

    static {
        input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.print("Enter please text: ");
        String text = input.nextLine();
        if (text.length() % 2 == 0) {
            text = text.toLowerCase();
        } else {
            text = text.toUpperCase();
        }
        System.out.println(text);
    }
}

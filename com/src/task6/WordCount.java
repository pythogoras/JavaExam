/*Написати програмний код, який рахує кількість слів у переданому рядку*/
package task6;

import java.util.Scanner;



public class WordCount {
    private static Scanner input;

    static {
        input = new Scanner(System.in);
    }
    
    private static int countWords(String str) {
        String[] words = str.split("\\s");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.print("Please enter a sentence: ");
        String sentence = input.nextLine();
        int count = countWords(sentence);
        System.out.println("Number of words in a line: " + count);
    }
}

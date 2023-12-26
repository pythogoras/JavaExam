/*Напишіть код для перевірки валідності дати народження у форматах: 
дд.мм.рррр або дд/мм/бррр*/
//java 20.0.1
package task3;

import java.util.Scanner;



class DateValidator {
    private static Scanner input;

    static {
        input = new Scanner(System.in);
    }
    public static void main(String[] args) {
       System.out.print("Please enter your date of birth: ");
       String date = input.next();
       if (Validator.validDate(date)) {
            System.out.println("Success! Valid date.");
       }
    }
}

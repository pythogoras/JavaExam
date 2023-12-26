/*3 Написати програмний код для перевірки валідності почтового адресу.*/
//java 20.0.1
package task4;

import java.util.Scanner;
import java.util.regex.Pattern;



class EmailValidator {
    private static final String PATTERN = "^[a-zA-Z0-9_!#$%&'*+=?^`|~-]+@[a-z]+(\\.[a-z]+)*$";
    private static Scanner input;

    static {
        input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.print("Enter please Your email: ");
        String email = input.next();
        if (validEmail(email)) {
            System.out.println("Email " + email + " is valid");
        } else {
            System.out.println("Email " + email + " is not valid");
        }
    }

    private static boolean validEmail(String email) {
        return Pattern.matches(PATTERN, email);
    }
}

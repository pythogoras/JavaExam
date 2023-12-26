package task1;

import java.util.Scanner;
import java.util.regex.Pattern;



class MutateText {
    private Scanner input;
    private String phoneNumber;

    MutateText() {
        this.input = new Scanner(System.in);
    }

    private boolean validNumber() {
        boolean valid = Pattern.matches("\\d*", this.phoneNumber);
        if (!valid) {System.out.println("Error! the expression must contain only numbers");}
        else {valid = this.validLength(valid);}
        return valid;
    }

    private boolean validLength(boolean valid) {
        if (this.phoneNumber.length() != 10) {
            System.out.println("Error! the expression must contain 10 characters");
            valid = false;
        }
        return valid;
    }

    boolean setText() {
        System.out.print("Enter a phone number: ");
        this.phoneNumber = this.input.next();
        return this.validNumber();
    }

    void getText() {
        String mutateNumber = this.phoneNumber.replaceAll("(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "($1)$2-$3-$4");
        System.out.println("Redacted phone number: " + mutateNumber);
    }
}

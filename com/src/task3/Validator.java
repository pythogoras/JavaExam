package task3;

import java.time.LocalDate;



class Validator {
    private static int day;
    private static int month;
    private static int year;
    private static int nowYear;
    private static boolean validMonDay;
    private static boolean validYr;

    static {
        day = 0;
        month = 0;
        year = 0;
        nowYear = LocalDate.now().getYear();
        validMonDay = false;
        validYr = false;
    }

    static boolean validDate(String date) {
        if (date.matches("^\\d{2}.\\d{2}.\\d{4}$") || date.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
            day = Integer.parseInt(date.substring(0, 2));
            month = Integer.parseInt(date.substring(3, 5));
            year = Integer.parseInt(date.substring(6));
            validMonth();
            validYear();
        } else {
            System.out.println("Error! Not correct format date.");
        }
        return validMonDay && validYr;
    }

    private static void validMonth() {
        if (month < 1 || month > 12) {
            System.out.println("Error! Not correct month");
        } else if ((month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day < 1 || day > 31)) {
            System.out.println("Error! This month has 31 days");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30)) {
            System.out.println("Error! This month has 30 days");
        } else if (month == 2) {
            if (((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) && (day < 1 || day > 28)) {
                System.out.println("Error! This month has 28 days");
            } else if (day < 1 || day > 29) {
                System.out.println("Error! This month has 29 days");
            } else {
                validMonDay = true;
            }
        } else {
            validMonDay = true;
        }
    }

    private static void validYear() {
        if (nowYear - year > 110) {
            System.out.println("Hi, Duncan MacLeod!");
        } else if (nowYear < year) {
            System.out.println("Be born first!");
        } else {
            validYr = true;
        }
    }
}

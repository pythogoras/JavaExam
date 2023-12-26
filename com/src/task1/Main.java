/*Написати програмний код. У додаток надходить рядок з номером телефона, який складається з 10 цифр написаних разом. Потрібно додати до номера розділові знаки.
Вхідні данні:
0971112233
Вихідні данні:
(097)111-22-33*/
//java 20.0.1
package task1;



public class Main {

    public static void main(String[] args) {
       MutateText mutate = new MutateText();
       boolean error = mutate.setText();
       if (!error) {return;}
       mutate.getText();
    }
}

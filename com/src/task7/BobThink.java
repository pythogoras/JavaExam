/*Написати програмний код, який додає до рядку фразу «Bob think» 3 рази: у початок, середину та кінець.
Вхідні данні: «Нарешті канікули»
Вихідні данні:	Bob think - «Нарешті канікули»
«Нарешті канікули» - Bob think
«Нарешті - Bob think - канікули»*/
package task7;



public class BobThink {
    static private final String template = "Finally holidays";
    static private final String prompt = "Bob think";

    public static void main(String[] args) {
        System.out.println(prompt + " - " + template);
        System.out.println(template + " - " + prompt);
        String newPrompt = " - " + prompt + " - ";
        System.out.println(template.replace(" ", newPrompt));
    }
}

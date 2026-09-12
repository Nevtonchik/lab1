package by.bseu.kulchinskiy.lab01;

import org.apache.commons.lang3.StringUtils;

public class HelloApplication {
    public static void main(String[] args) {
        String studentName = "A. A. Kulchinskiy";
        String greeting = "hello, " + studentName + "!";

        System.out.println(StringUtils.capitalize(greeting));
        System.out.println("My first Maven project works!");
    }
}

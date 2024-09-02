import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //you must have this part to define the scanner

        System.out.print("Enter your age: "); // prints the msg out
        int age = scanner.nextInt(); //this part reads the value the user input and then stores it as "age"

        int minDateAge = (age / 2) + 7; // calculation part of the code and stores it as "minDateAge"
        System.out.println(age + "-year olds should date somebody who is at least " + minDateAge + " years old."); // then we have both "age" and "minDateAge" identified then we can fill the sentence in

        scanner.close(); // closes the scanner
    }
}

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if (inputChar >= 0 && inputChar <= 127) {
            System.out.println("The character '" + inputChar + "' is an ASCII character.");
        } else {
            System.out.println("The character '" + inputChar + "' is a Unicode character.");
        }

        System.out.println("The Unicode value of the character is: " + (int) inputChar);
    }
}

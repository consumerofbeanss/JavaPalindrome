import java.util.Stack;
import java.util.Scanner;

public class PalindromeStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack palindrome = new Stack();
        Boolean loop = true;
        while (loop == true) {
            System.out.println("Enter a string: ");
            String text = scan.nextLine();

            for (int i = 0; i < text.length(); i++) {
                palindrome.push(text.charAt(i));
            }

            String palCheck = "";

            while (palindrome.size() != 0) {
                palCheck = palCheck + palindrome.pop();
            }

            if (palCheck.equals(text)) {
                System.out.println("The string is a palindrome");
            } else {
                System.out.println("The string is not a palindrome");
            }
            System.out.println("Try another string?");
            String ask = scan.nextLine();
            switch (ask) {
                case "yes":
                    break;
                case "no":
                    loop = false;
                    break;
            }
        }
    }
}
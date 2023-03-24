import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class PalindromeQueue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Queue queue = new LinkedList();
        boolean loop = true;
        while(loop == true) {
            System.out.println("Enter a string: ");
            String text = scan.nextLine();
            for (int i = 0; i < text.length(); i++) {
                queue.add(text.charAt(i));
            }
            String rev = "";

            while (!queue.isEmpty()) {
                rev = queue.remove() + rev;
            }

            if (rev.equals(text)) {
                System.out.println("The string is a palindrome");
            } else {
                System.out.println("The string is not a palindrome");
            }

            System.out.println("Try another string?");
            String ask = scan.nextLine();
            if (ask.equals("yes") || ask.equals("Yes") || ask.equals("Y") || ask.equals("y")){
                loop = true;
            }
            else{
                loop = false;
            }
        }
    }
}

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String line = in.nextLine();
        if (isPalindrome(line)) {
 System.out.println(line + " is a  palindrome.");
        } else {
            System.out.println(line + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        String nonLetters = ",.:;()[]{}!@#$%^&*? ";
        str = str.toLowerCase();
        String front = "";
        String back = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i, i + 1);
            if (!nonLetters.contains(ch)) {
                front = front + ch;    
                back = ch + back;  
            }
        }
        return front.equals(back);
    }
}

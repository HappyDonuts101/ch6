import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(pigLatin(line));
    }

    public static String pigLatin(String msg) {
    msg = msg + " ";
   String res = "";
  String word = "";
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == ' ') {
                if (word.length() > 2) {
   word = word.substring(1) + word.substring(0, 1) + "ay";
                }
                res = res + word + " ";
         word = "";
            } else {
                word = word + msg.charAt(i);
            }
        }
        return res.substring(0, res.length() - 1);
    }
}

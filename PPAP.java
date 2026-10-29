import java.util.Scanner;

public class PPAP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(ppap(line));
    }

    public static String ppap(String str) {
        String a = str.substring(9, str.indexOf(","));
        String b = str.substring(9 + a.length() + 11);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        return "Uh! " + b + " " + a;
    }
}

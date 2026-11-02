import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(convertToBinary(num));
    }

    public static String convertToBinary(int num) {
        String res = "";
        for (int i = num; i > 0; i = i / 2) {
            res = (i % 2) + res;
        }
        return res;
    }
}

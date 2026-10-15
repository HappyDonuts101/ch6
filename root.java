import java.util.Scanner;

public class root {
public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    System.out.print("Input a positive number: ");
    double n = in.nextDouble();
    System.out.println(squareRoot(n));
    //in.close();



} public static double squareRoot(double a) {

    double  x0 = a/2;
    double x1 = (x0 + a/x0) / 2;

    while(Math.abs(x1-x0)>0.0001) {

        x0 = x1;
        x1 = (x1 + a/x1)/2 ;

    }
    return x1;

    

}





}
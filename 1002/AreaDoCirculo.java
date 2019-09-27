import java.util.Scanner;
public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double a = in.nextDouble();
        System.out.format("A=%.4f%n",3.14159 * (a*a));
    }   
}

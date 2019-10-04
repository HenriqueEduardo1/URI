import java.io.IOException;
import java.util.Scanner; 
public class Main {   
    public static void main(String[] args) throws IOException {        
        Scanner in = new Scanner(System.in);
       
        String a = in.nextLine();      
        double b = in.nextDouble();       
        double c = in.nextDouble();
              
        System.out.format("TOTAL = R$ %.2f\n", (b + (c * 0.15)));  
    }
}

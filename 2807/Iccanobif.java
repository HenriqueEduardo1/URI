import java.util.Scanner;
public class Iccanobif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int[] b = new int[a];
        
        for(int i = 0; i < a; i++){
            b[b.length - i -1] = fibo(i);
        }
        for(int i = 0; i < b.length; i++){
            if(i == 0){ System.out.print(b[i]); }
            else{ System.out.print(" " + b[i]); }
        }
        System.out.println();
    }
    private static int fibo(int a){
        if((a == 0) || (a == 1)){return 1; }
        return fibo(a - 1) + fibo(a - 2); 
    }    
}

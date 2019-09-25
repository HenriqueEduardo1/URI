import java.util.Scanner;
public class ORetornoDoRei {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String n = in.nextLine();
        char[] a = n.toCharArray();
        double cont = 0;
        int cont1 = 0;
        int qd = 0;
        
        for(int i = 0; i < a.length;i++){
            
            if(a[i] == '0'){
                cont += 10;
                cont1++;
                qd++;
            }
            else if(a[i] != '1'){
                cont =  cont + (int)a[i] - 48;
                cont1++;
            }
            else if(a[i] == '1'){
                cont += 1;
                cont1++;
            }
            
        }
        System.out.printf("%.2f", ((cont - qd) / (cont1 - qd)));
    }
}

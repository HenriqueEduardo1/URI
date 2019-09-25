
import java.io.IOException;
import java.util.Scanner;

public class TelefoneSemFio {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();
        
            for (int i = 0; i < t; i++) {
                int cont1 = 0;
                int cont2 = 0;
                boolean a1 =  false;
                boolean a2 =  false;
                
                String og = in.nextLine();
                String time1 = in.nextLine();
                String time2 = in.nextLine();

                char[] a = og.toCharArray();
                char[] b = time1.toCharArray();
                char[] c = time2.toCharArray();

                for (int j = 0; j < a.length; j++) {
                    if (b[j] == a[j]) {
                        cont1++;
                    }
                    if (c[j] == a[j]) {
                        cont2++;
                    }
                }
                
                if (cont1 > cont2) {
                    System.out.println("Instancia " + (i + 1) + "\n" + "time 1" + "\n");
                } else if (cont2 > cont1) {
                    System.out.println("Instancia " + (i + 1) + "\n" + "time 2" + "\n");
                } else if (ganhou(a, b, c) == 1){
                    System.out.println("Instancia " + (i + 1) + "\n" + "time 1" + "\n");
                } else if (ganhou(a, b, c) == 2) {
                    System.out.println("Instancia " + (i + 1) + "\n" + "time 2" + "\n");
                } else {
                    System.out.println("Instancia " + (i + 1) + "\n" + "empate" + "\n");
                }
        }
    }
    public static int ganhou(char[] a, char[] b, char[] c){
        for (int j = 0; j < a.length; j++) {
            if(b[j] == a[j] && c[j] != a[j]){
                return 1;
            }
            if(c[j] == a[j] && b[j] != a[j]){
                return 2;
            }
        }
        return 0;
    }
}

import java.util.Scanner;
public class DistanciaEntreDoisPontos {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
        
       float x1 = in.nextFloat();
       float y1 = in.nextFloat();
       float x2 = in.nextFloat();
       float y2 = in.nextFloat();
       
       float v1 = (float) Math.pow((x2 - x1),2);
       float v2 = (float) Math.pow((y2 - y1),2);
       
       System.out.format("%.4f\n", Math.sqrt((v1 + v2)));        
    }
}



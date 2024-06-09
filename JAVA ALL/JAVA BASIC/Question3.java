import java.util.Scanner;

public class Question3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float erasor=sc.nextFloat();
        float bill=(pencil+pen+erasor);
        float totalbill=bill+(bill*18)/100;
        System.out.println(totalbill);
    }
}

public class RactengleHollow {
    public static void hollow_rectangle(int totrow,int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcol;j++){
                if(i==totrow || i==1 || j==totcol || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
    public static void main(String args[]){
        hollow_rectangle(4, 5);
    }
}
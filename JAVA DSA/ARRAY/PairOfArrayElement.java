public class PairOfArrayElement {
    public static void printPairs(int numbers[]){
       for(int i=0;i<numbers.length;i++){
        for(int j=i+1;j<=numbers.length-1;j++){
            System.out.print(" ("+numbers[i]+","+numbers[j]+") ");

        }
        System.out.println("");
       }
    }

    public static void main(String args[]){
        int number[]={2,3,4,65,7,8,10};
        printPairs(number);


    }
    
}

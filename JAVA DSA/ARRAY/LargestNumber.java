import java.util.*;
public class LargestNumber {
    public static int LargestNum(int numbers[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>large){
                large=numbers[i];
            }
        }
        return large;
    }

    public static void main(String args[]){
        int Array[]={2,45,66,76,54,455,6443,5643,3,3,23535};
        System.out.println("The Largest Number is "+LargestNum(Array));
    }
}

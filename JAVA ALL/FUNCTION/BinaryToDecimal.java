public class BinaryToDecimal {
    public static void binToDec(int n){
        int mynum=n;
        int pow=0;
        int decNum=0;

        while(n>0){
            int lastDigit=n%10;
            decNum=decNum+(lastDigit*(int)(Math.pow(2, pow)));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of "+mynum+" is equal to "+decNum);
    }


    public static void main(String args[]){
       binToDec(1111); 
    }
}

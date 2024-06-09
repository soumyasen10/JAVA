public class DecimalToBinary {
    public static void decTobin(int num){
        int pow=0;
        int bin=0;
        int decnum=num;

        while(num>0){
            int remain=num%2;
            bin=bin+(remain*((int)Math.pow(10, pow)));
            pow++;
            num=num/2;
        }
        System.out.println("Binary of "+decnum+" is equal to "+bin);
    }

    public static void main(String args[]){
        decTobin(12);
    }
}

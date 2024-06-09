public class EvenOrOdd {
    public static boolean  isEven(int n){
        boolean Even=true;
        if(n%2==0){
            return Even;
        }
        else{
            return Even=false;
        }
    } 
    public static void main(String args[]){
        boolean result=isEven(3);
        if(result==true){
            System.out.println("This is a even number");
        }
        else{
            System.out.println("This is a odd number");
        }
    }
}

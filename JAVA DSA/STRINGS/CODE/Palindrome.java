import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        boolean isPalin=true;
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        for(int i=0;i<=name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                isPalin=false;
                break;
                
            }
        }

        if(isPalin==true){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrpme");
        }
    }
}
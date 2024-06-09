public class Anagrams {
    public static boolean isAnagram(){
        boolean Anagram=false
            for(int i=0;i<str.length();i++){
                for(int j=0;j<str.length();j++){
                    if(str.charAt(i)==str1.charAt(j)){
                        Anagram=true;
                    }
                     Anagram;
                }
            }
    }
    public static void main(String args[]){
        String str="race";
        String str1="care";
 
        if(str.length()==str1.length()){
            boolean isAnagram=true;

            
                   if(isAnagram==true){
                    System.out.println("Anagram");
                   }
                   else{
                    System.out.println("Not Anagram");
                   }
        }

       }
    }


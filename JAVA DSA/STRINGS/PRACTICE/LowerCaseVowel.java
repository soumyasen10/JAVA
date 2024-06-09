public class LowerCaseVowel{
    public static void main(String args[]){
        String name="aaa  Eeio ouu  uu";
        Integer count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='i'||name.charAt(i)=='e' || name.charAt(i)=='a' || name.charAt(i)=='o' || name.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count+" times lowercase vowels will occured!");
    }
}
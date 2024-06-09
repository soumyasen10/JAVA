public class SubString{
    public static void main(String args[]){
        String name="hello world";
        int si=0;
        int ei=5;
        String str="";
        for(int i=si;i<ei;i++){
            str+=name.charAt(i);
        }
        System.out.println(str);
    }
}
package Str;
//camparison of the two string
public class Q3 {
    public static boolean Compare(String str1 , String str2){
     if(str1.equals(str2)){
        return true;
     }
     return false;
    }
    public static void main(String[] args) {
        String str1="vikash";
        String str2="vikash";
        System.out.println(Compare(str1, str2));
    }
    
}

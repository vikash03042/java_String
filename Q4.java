package Str;
//Sub-string question
public class Q4 {
public static String subString(String str,int si ,int ei)
{
    String subStr="";
    for(int i=si;i<ei;i++){
        subStr +=str.charAt(i);
    }
    return subStr;
}    
public static void main(String[] args) {
    String str ="HelloWorld";
    System.out.println(subString(str, 5, 10));
}
}

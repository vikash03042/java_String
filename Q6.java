package Str;
// String-builder
public class Q6 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("");
for(char ch ='a';ch<='z';ch++){
    sb.append(ch+",");
    
}
for(char ch ='A';ch<='Z';ch++){
    sb.append(ch+",");
    if(ch=='z'){
     
    }
}
System.out.println("\n"+ sb);
    }
    
}

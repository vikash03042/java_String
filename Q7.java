package Str;
//To convert into upper case of 1st letter of the each word
public class Q7 {
public static String touppercase(String str){
    StringBuilder sb = new StringBuilder("");

    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1;i<str.length(); i++){
        if(str.charAt(i)==' '&&i<str.length()-1){
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
    }
    else{
        sb.append(str.charAt(i));
    }
}
return sb.toString();
}
    public static void main(String[] args) { 
        String str="hi, i am vikash yadav  Lorem ipsum dolor sit amet consectetur adipisicing elit. Quasi mollitia ex cumque eum vero. Ex quo tenetur illo recusandae velit voluptatibus error deserunt placeat doloribus provident excepturi labore eaque, vel aspernatur obcaecati aliquid quasi molestias! ";
        System.out.println(touppercase(str));
    }
}
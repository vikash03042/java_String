package Str;
// comparision according to the lexicographic methods which says that the String which having 1st letter is smaller in squense then it will be considered as small string

public class Q5 {
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};
        String largest =fruits[0];

        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];

            }
        }
        System.out.println(largest);;
    }
} 

package Str;
//To find the shortest path by using directions name news
public class Q2 {
    public static float getshortpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='s'){
                y--;
            }
            //north
            if(dir=='n'){
                y++;
            }
            //east
            if(dir=='e'){
                x++;

            }
            //west
            if(dir=='w'){
                x--;
            }
        }
       int  X=x*x;
      int   Y=y*y;
        return (float)Math.sqrt(X+Y);
    }
    
    public static void main(String[] args) {
        
        String path="wneenesennn";
        System.out.println(getshortpath(path));
    }
    
}

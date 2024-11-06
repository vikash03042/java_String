package Str;

import java.util.*;
public class Q8 {
    public static void largestNum(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               
                if (mat[i][j] >largest) {
                    largest=mat[i][j];
                     
                }
                
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        // int mat[][]=new int [3][3];
        int [][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int n = mat.length;
        int m = mat[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]);
                 
                 
            }
             System.out.println("\n");
        }
       
        largestNum(mat);
      

    }

}

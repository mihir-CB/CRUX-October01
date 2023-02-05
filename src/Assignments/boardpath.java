package Assignments;

import java.util.*;
public class boardpath {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int c = boardpath(n,m,0, new StringBuilder());
        System.out.println();
        System.out.println(c);
    }

    private static int boardpath(int n, int m, int cp, StringBuilder sb){
        if(cp==n){
            System.out.print(sb.toString()+" ");
            return 1;
        }
        if(cp>n){
            return 0;
        }

        int count = 0;
        for(int i=1;i<=m;i++){
            sb.append(i);
            count+= boardpath(n,m,cp+i,sb);
            sb.deleteCharAt(sb.length()-1);      
        }
        return count;
    }
}

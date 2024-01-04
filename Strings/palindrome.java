package Strings;

import java.util.Scanner;

public class palindrome {
    public static boolean check(String str){
        for(int i=0;i<str.length()/2;++i){
            int length=str.length();
            if(str.charAt(i)!=str.charAt(length-i-1)) {
                return false;
            }
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=new String();
        str=in.next();
         System.out.print( check(str));


    }
    
}

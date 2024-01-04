package Strings;

public class shortestPath { 
    public static void findPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();++i){
            if(str.charAt(i) == 'W') --x;
            if(str.charAt(i) == 'N') ++y;
            if(str.charAt(i) == 'S') --y;
            if(str.charAt(i) == 'E') ++x;
        }
        int x2=x*x;
        int y2=y*y;
        float distance=(float)Math.sqrt(x2+y2);
        System.out.println(distance);

    }
    public static void main(String[] args) {
    String str="WNEENESENNN";
    findPath(str);
    }
    
    
}

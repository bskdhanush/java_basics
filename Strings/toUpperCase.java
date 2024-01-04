package Strings;

public class toUpperCase {
    public static void convert( String str){
        StringBuilder br=new StringBuilder("");
         br.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();++i){
            if(str.charAt(i)== ' ' && i<str.charAt(i)-1){
                br.append((str.charAt(i)));
                ++i;
                br.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                br.append(str.charAt(i));
            }
        }
        System.out.println(br);
    }
    public static void main(String[] args) {
        String str="hi, i am dhanush";
        convert(str);

    }
    
}

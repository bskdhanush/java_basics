package Strings;

public class stringCompression {
    public static void compression(String str){
        StringBuilder br=new StringBuilder("");
         //int leftp=0;
         int rightp=0;
         int count =0;
         int temp=0;
         int length=str.length();
          for(int i=0;i<length;++i){
            
            if(str.charAt(rightp)==str.charAt(i)){
                count++;
                // System.out.println(count);
            }
            if(str.charAt(rightp)!=str.charAt(i)|| str.charAt(i)<str.length()){
                br.append(str.charAt(rightp));
                temp=count;
               //  System.out.println(temp);
                rightp+=temp;
                br.append(temp);
               // System.out.println(rightp);
                --i;
                count=0;
            }
           
           
            
            
            /*while (str.charAt(i)==str.charAt(rightp)) {
                
                count++;
                rightp++;
            }*/

         }
          br.append(str.charAt(length-1));
            br.append(temp-1);
             System.out.println(br);

    }
    public static void main(String[] args) {
        String str= "aaabbcccdd";
        compression(str);
        
    }
}

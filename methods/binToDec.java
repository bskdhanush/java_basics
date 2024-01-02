public class binToDec {
    
    public static void dectobin(int bin){
         int pow=0;
         int decNum=0;
         while (bin>0) {
            int ldigit= bin%10;
            decNum=decNum+ (ldigit*(int)Math.pow(2, pow));
            pow++;
            bin=bin/10;
         }

        System.out.println(decNum);

    }
public static void main(String [] args){

        dectobin(10010101);
    }
}
                 
package bitManipulation;

public class operations {

    public static void get(int number,int position){
        if((number & (1<<position))!=0){
            System.out.println("the bit is 1");
        }
        else System.out.println("the bit is 0");
    }

    public static void set(int number,int position){
         System.out.println("after changing: " +(number | (1<<position)));
    }

    public static void clear(int number,int position){
        int bitManipulator=1<<position;
        System.out.println("after clearing i'th bit: " +(number & (~bitManipulator)));
    }

    public static void clearLastIbits(int number,int position){
         int bitMask= ~0<<position;
         System.out.println("after clearing n bits: " +(number & (bitMask)));

    }
    public static void clearRangeOfBits(int number, int lp,int rp){
        lp=(1<<lp)-1;
        rp= (~0)<<(rp+1);
         System.out.println("after clearing n range bits: " + (number &(lp|rp)));

    }

    public static void countSetBits(int  number){
        int count =0;
        while (number>0) {
            if((number&1) !=0){
                count++;
            }
            number=number>>1;
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        int number=10;
        int position=2;
        //get(number,position);
        //set(number,position);
        //clear(number,position);
        //clearLastIbits(number,position);
        //clearRangeOfBits(10,2,4);
        countSetBits(number);
    }
}

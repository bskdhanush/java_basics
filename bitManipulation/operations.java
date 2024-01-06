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
    public static void main(String[] args) {
        int number=10;
        int position=1;
        get(number,position);
        set(number,position);
        clear(number,position);
    }
}

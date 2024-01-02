public class palindrome {

    public static void checkPalindrome(int number){
        int pow=0,newNum=0,tempNum=number;
        while(number>0){
            int ldigit=number%10;
            newNum=newNum*10+ldigit;
            //System.out.println(newNum+""+pow);
            pow++;
            number /=10;
        }

       // System.out.println(newNum);
       if(tempNum == newNum) System.out.println("given number is palindrome"); 
        else System.out.println("given number is not palindrome");


    }
    public static void main(String[] args) {
        checkPalindrome(101);
    }
}

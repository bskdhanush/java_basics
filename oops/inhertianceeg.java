package oops;

public class inhertianceeg {
    public static void main(String[] args) {
        mammal ma=new mammal();
        bird br=new bird();
        fish fi=new fish();
        br.eat();
        ma.breath();
        
    }
}

class animal{
    void eat(){
      System.out.println("From eat");
    }
    void breath(){
       System.out.println("From breath");
    }
}
class fish extends animal {
    void tuna(){
        System.out.println("From tuna");
    }
    void shark(){
        System.out.println("From shark");
    }

}

class bird extends animal{
    void peecock (){
       System.out.println("From peecock");
    }
}

class mammal extends animal{
    void dog(){
      System.out.println("From dog");
    }
    void cat(){
        System.out.println("From cat");
    }
    void human(){
         System.out.println("From human");

    }
}

package oops;

public class abstracteg {
    public static void main(String[] args) {
        hen h=new hen();
        h.eat();
        h.walks();
    }
    
}

abstract class animal{
    void eat(){
        System.out.println("it eats");
    }

    abstract void walks();
}

 class horse extends animal {
    void walks(){
        System.out.println("It walks on 4 legs");
    }
}

class hen extends animal{
    void walks(){
        System.out.println("it walks on 2 legs");
    }
}


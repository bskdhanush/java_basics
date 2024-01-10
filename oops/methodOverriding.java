package oops;

public class methodOverriding {
    public static void main(String[] args) {

        method2 m2=new method2();
        m2.hello();
    }
}
class method1{
    void hello(){
        System.out.println("from mehtod 1");
    }
}
 class  method2 extends method1{
    void hello(){
        System.out.println("from method 2");
    }

    
}
    

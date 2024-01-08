package oops;

public class inhertiance {
    public static void main(String[] args) {
        lion li=new lion();
         li.color= "goldenYellow";
         li.eat();
         li.hunt();
         System.out.println(li.color);
    }
}

//parent class or base class
class animals {
    String color;
    animals(){
        System.out.println("default const of animal class");
    }
    void eat(){
        System.out.println("eat function called");
    }
}

// child class or derived class
class lion extends animals{
   void hunt(){
    System.out.println("lion hunts");
   }
 
}

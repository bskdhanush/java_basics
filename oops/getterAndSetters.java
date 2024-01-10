package oops;

class getAndSetter{
  private String name;
  private String password;
   void setname(String name){
    this.name= name;
    
   }
   void setpass(String password){
     this.password=password;
   }

   public String getName() {
       return name;
   }
   
   public String getPassword() {
       return password;
   }


}

public class getterAndSetters {
    public static void main(String[] args) {
        getAndSetter gs=new getAndSetter();
        gs.setname("bsk");
        gs.setpass("bsk123");
        System.out.println( gs.getName()+" "+gs.getPassword());
    }
}

package oops;
public class shallowAndDeepCopy {
    public static void main(String [] args){
        student s1=new student();
        s1.name="bsk";
        s1.roll=20;
        s1.password="xyz";
        s1.marks[0]=100;
        s1.marks[1]=80;
        s1.marks[2]=85;

        student s2=new student(s1);
        s2.password="new pass";
        s1.marks[1]=90;

        for(int i=0;i<s2.marks.length;++i ){
          System.out.print(s2.marks[i]+" ");

    }
  }
}

class student {
    int roll;
    String name;
    String password;
    int[] marks=new int[3];


    //copy constructor or shallow copy of array list
    // student(student s1){
    //     this.name=name;
    //     this.roll=roll;
    //     this.marks=s1.marks;
    // }

    student(){
       //marks=new int[3];
        System.out.println("This is an default constructor call");
    }
     student(int roll){
       this.roll=roll;
    }
     student(String name){
       this.name=name;
    }



        // //deep copy
        student(student s1){
            this.name=s1.name;
            this.roll=s1.roll;
            for(int i=0;i<marks.length;++i ){
                  this.marks[i] =s1.marks[i];
         }
           
        }

    }
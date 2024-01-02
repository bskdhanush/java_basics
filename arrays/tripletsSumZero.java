import java.util.ArrayList;

public class tripletsSumZero {
    public static void triples(int num[]){
        ArrayList<Integer> list= new ArrayList<Integer>(); 
        for(int i=0;i<num.length-2;++i){
            for(int j=i+1;j<num.length-1;++j){
                if(num[i]+num[j]+num[j+1]==0){
                 System.out.println(num[i]+""+num[j]+""+num[j+1]);
                // list.add()
                }
                
                 
            }
        }
         

    }
    public static void main(String[] args) {
        int num[]={-1,0,1,0,2,-1,-4};
         triples(num);
    }
}

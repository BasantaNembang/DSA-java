import java.util.Arrays;

public class ArrayReferene1 {

    static void change(int[] age){   //making all value Zero
    for(int i=0; i<age.length; i++ ){
        age[0]=0;   //assign 0 to all the value
    }
    }

    static void Print(int [] age){    //Print the Array
        for(int i=0; i<age.length; i++){
            System.out.print(age[0]+" ");
        }
    }

    static void countT(int[] any, int x){    //Print how many times number is come
          int count=0;
          for(int i=0; i<any.length; i++){
           if(any[i]==x){
            count++;
           }   
        }
        System.out.println("It repated "+count);
    }

    static void lastPre(int[] any, int x){//Last time x is seem
        int seem=0;
        for(int i=0; i<any.length; i++){
            if(any[i]==x){
              seem=i;
            }
            }
            System.out.println(seem);
    }

    static boolean isSorted(int[] x){  //Is sorted or not 
        boolean result=true;
        for(int i=1; i<x.length; i++){
            if(x[i]<x[i-1]){
            result=false;
            break; }
        }
       System.out.println("False for not & True for yes: "+result);
        return result;
    }

    static int [] smallestAndbiggest(int []x){  //Print the largest and smallest
        Arrays.sort(x);
        int ans[]={x[0],x[x.length-1]};
        return ans;
    } 
    
    
    public static void main(String[] args) {
        int age[]=new int[4];
        age[0]=2;
        age[1]=3;
        age[2]=4;
        age[3]=5;    
       // change(age);
       // Print(age);
      int any[]={1,4,2,3,3,4,5,8};
      int sal[]={2,3,4,5,6};
      int r[]={4,6,7,8,0,12};
      // countT(any,7);
      //lastPre(any, 4);
     //  isSorted(any);
    //    System.out.println();
    //    isSorted(sal);
    int s[] =smallestAndbiggest(r);
    System.out.println(s[0]);
    System.out.println(s[1]);

    }
    
}

package Sorting;

public class arrangeAlphabete {
    static void mthD(String[] any){
        int n=any.length;
        for(int i=0; i<n-1; i++){
            int minItm=i;
            for(int j=i+1; j<n; j++){
               if(any[j].compareTo(any[minItm])<0){
                      minItm=j;
                }
                                 }
             String temp=any[i];
             any[i]=any[minItm];
             any[minItm]=temp;
        }
        for (String d : any) {
         System.out.print(d+" ");          
        }
    }
    public static void main(String[] args) {
        String fal[]={"mango", "apple", "litchi", "orange", "coconut"};
        mthD(fal);      
    }
 }
// String s="apple";
// String s2="pple";
//  System.out.println(fal[1].compareTo(fal[0]));
// System.out.println(any[minItm].compareTo(any[j]));


package Sorting;
//bubble sort
public class bubbleS {
    static void bSort(int[] any){
    int n=any.length;
     for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
           if(any[j]>any[j+1]){
            int sathy=any[j];
            any[j]=any[j+1];
            any[j+1]=sathy;
           }
        }
     }
     for(int i=0; i<n; i++)
     {
        System.out.println(any[i]);
     }
    }
    public static void main(String[] args) {
        int b[]={8,9,7,4,5};
     // System.out.println(b.length);
       bSort(b);
      
    }
}

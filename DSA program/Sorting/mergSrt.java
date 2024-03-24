package Sorting;

public class mergSrt {

    //Arrange two array
    static void arg(int []any, int f, int midT, int l){
      int n1=midT-f+1;
      int n2=l-midT;
      int left[]=new int[n1];
      int right[]=new int[n2];
      int i,j,k;
      for(i=0; i<n1; i++) left[i]=any[f+i];
      for(j=0; j<n2; j++)  right[j]=any[midT+1+j];
        i=0;
        j=0; 
        k=f;
      //check
      while (i<n1 && j<n2) {
            if(left[i]<=right[j]){
                any[k]=left[i];
                i++;
            }else{
                any[k]=right[j];
                j++;
            }           
             k++;  }
         //now remaing
         while (i<n1)  any[k++]=left[i++];
         while (j<n2)  any[k++]=right[j++];
    }
    //Reculsive work
    static void recull(int []any, int f, int l){
        if(f>=l) return;
        int midT=(f+l)/2;
        recull(any, f, midT);
        recull(any, midT+1, l);
        arg(any, f, midT, l);
    }
    //To print
    static void print(int []any){
        for (int i : any) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,8,9,0,1};
        int n=arr.length;
        int org=n-1; //actual length
        recull(arr, 0, org);
        print(arr);
    }
   
}

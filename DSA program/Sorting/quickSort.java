package Sorting;

public class quickSort {
    //
    static void printA(int[] any){
        for (int i : any) {
            System.out.print(i+" ");
        }
    }
    //
    static void swaP(int any[],int x, int y){
        int temp=any[x];
        any[x]=any[y];
        any[y]=temp;
    }
    //
    static int pivotMethod(int []any, int x, int y){
        int pivot=any[x];
        int count=0;
        for(int i=x+1; i<=any.length-1; i++){
            if(pivot>any[i]){
                count++;
            }
        }
        int pivotIdx=x+count;
        swaP(any,x, pivotIdx);  //method call
        //ow only work remaining is to arange element > then pivot and < then pivot
       int i=x;
       int j=y;
        while (i<=pivotIdx && j>pivotIdx) {
             while(any[i]<=any[pivotIdx])  i++;
             while(any[j]>any[pivotIdx])  j--;
             while (i<=pivotIdx && j>pivotIdx) {
                  swaP(any, i, j);
                  i++;
                  j--;
             }
        }
        return pivotIdx;
    }
    //
     static void quickMtd(int[] any, int x, int y){
    if(x>=y)return;
      int pation=pivotMethod(any, x, y);
      quickMtd(any, x, pation-1);
      quickMtd(any,pation+1, y);
    }
    public static void main(String[] args) {
        int arr[]={4,12,3,5,8,7,6};
        int n=arr.length-1;
        quickMtd(arr, 0, n);
        printA(arr);
    }  
}

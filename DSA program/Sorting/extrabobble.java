package Sorting;

//if 808099 ouput 889900
public class extrabobble {
    static void mthD(int []any){
     int n=any.length;
     for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
             if(any[j]==0 && any[j+1]!=0){
                int temp=any[j];
                any[j]=any[j+1];
                any[j+1]=temp;
             }
        }  
     }
     for (int datas : any) {
        System.out.print(datas+" ");
     }
    }
    public static void main(String[] args) {
        int []b={8,0,8,0,9,9};
        mthD(b);
    }
}

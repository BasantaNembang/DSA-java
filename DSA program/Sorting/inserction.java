package Sorting;

public class inserction {
    static void inserM(int [] any){
        int n=any.length;
        for(int i=1; i<n; i++){
            int j=i;
            // 4 ,3, 6 ,2 ,1 ,8

            while (j>0 && any[j]<any[j-1]) {
                int temp=any[j];
                any[j]=any[j-1];
                any[j-1]=temp;
                j--;     
            }     
        }
        for (int data : any) {
            System.out.print(data+" ");
            
        }
    }
    public static void main(String[] args) {
         int b[]={4,3,2,1,5};
         inserM(b);
    }
    
}

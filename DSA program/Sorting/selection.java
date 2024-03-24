package Sorting;

public class selection {
    //selection sort compare small and swap two values
        static void selecM(int [] any){
            int n=any.length;
            for(int i=0; i<n-1; i++){
               int minIndex=i;
                 for(int j=i+1; j<n; j++){
                     if(any[j]<any[minIndex]){
                        minIndex=j;
                     }
                 }
                 int temp=any[i];
                 any[i]=any[minIndex];
                 any[minIndex]=temp;
            }
            for(int i=0; i<n; i++)
            {
                 System.out.println(any[i]);
            }
        }
        public static void main(String[] args) {
            int [] bn={3,4,6,8,1,9,0,12};
            selecM(bn);
        }
}

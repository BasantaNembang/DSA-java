public class arrayRecursion {
     //Print th array 
    static void printA(int[] any, int idx){
        if(idx==any.length){
          return;
        }
        System.out.println(any[idx]);
        printA(any, idx+1);//gives value of array at index 0,1,2 respectively
    }

    //Print the largest among array
    static int largestA(int []any, int idx){
      if(idx==any.length-1){ //base case
        return any[idx];
      }
     int current=largestA(any, idx+1);//gives index of array at 0,1,2, and so onnnnnnnnn
      return Math.max(any[idx], current);
    }

   //print the sum of array
   static int sumA(int []any, int idx){
    if(idx==any.length-1){
          return any[idx];
    }
    int s=sumA(any, idx+1);
    return s+any[idx];
   }
    public static void main(String[] args) {
    int []mwp={1,3,4};
   // printA(mwp, 0);
 //  int l= largestA(mwp, 0);
 //  System.out.println(l);
 int yes=sumA(mwp, 0);
 System.out.println(yes);
}
}

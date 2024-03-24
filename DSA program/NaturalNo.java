public class NaturalNo {
   static void pN(int n){    //print like 1 2 3 4 5
      if(n==1){
        System.out.println(n);
        return;
      }
      pN(n-1); 
      System.out.println(n);
   }
     static void decreasing(int x){    // 3 2 1 like this
     if(x==1){
      System.out.println(x);
      return;
     }
     System.out.println(x);
     decreasing(x-1);
   }

   public static void main(String[] args) {
   // pN(6);
   decreasing(5);
    
   }
}                                                                                                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
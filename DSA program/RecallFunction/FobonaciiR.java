

public class FobonaciiR {  //no it is factorail 
  
        static int fr(int x) {
             if (x == 1) {
                 return 1;
             } 
            else {
                return x * fr(x - 1);
            }
        }
    
        public static void main(String[] args) {
            int x = fr(4);
            System.out.println(x);
        }
    }
    
  


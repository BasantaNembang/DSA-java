public class towerHanoi {
    static void tH(int n, char from, char extra, char to){
       if(n>0){
      tH(n-1, from, to, extra);
     // System.out.println("hi"+from, to);
     System.out.println("Move disk  from " + from + " to " + to);
     tH(n-1, extra, from, to);
       }
    }

    public static void main(String[] args) {
        tH(3, 'A','B', 'C');
    }
    
}

public class nembang {
   //print factoral number 
   void factoral(int x){
    int r=1;
    for(int i=1; i<=x; i++){
        r=r*i;
    }
    System.out.println(r);
   }
   //print fabanonaci series
   void fabanonaci(int f){
    int a=0;
    int b=1;
    System.out.println(a);
    System.out.println(b);
    for(int x=1; x<=f; x++){
      int s=a+b;
      System.out.println(s);
      a=b;
      b=s;        
    }
   }
    //
    void divid(){
        int a=1234;
        int b=10;
        int result=a%b;
        System.out.println(result);
    }
    public static void main(String[] args) {
        nembang m=new nembang();
        //m.divid();
        // m.factoral(7);
        m.fabanonaci(4);
    }

    
}

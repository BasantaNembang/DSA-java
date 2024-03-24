import java.util.Scanner;

public class Fbs {
    static int Fs(int x){//Print N th fibonaci series
    if(x==0 || x==1){
        return x;
    }
    int p=Fs(x-1);
    int pP=Fs(x-2);
    return p+pP;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number which you want to see the list of fibonanci series");
    int n=sc.nextInt();
    for(int x=0; x<n; x++){
        System.out.println(Fs(x));
    }
   }
    
}

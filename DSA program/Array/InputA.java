import java.util.Scanner;
public class InputA {
    public static void main(String[] args) {
        System.out.println("Enter index Size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int salary[]=new int[n];
        System.out.println("Enter "+n+" element");
       //Each enteryyy
       for(int i=0; i<salary.length; i++){
        salary[i]=sc.nextInt();
       }
      //Print
      for(int i=0; i<salary.length; i++){
        System.out.print(salary[i]+" ");
       }

    }
    //Taking input
}

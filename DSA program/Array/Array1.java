//package DSA program.Array;
public class Array1 {
    void MultiD(){
        //Multidimensional array
        //Normal way
        int md[][]=new int[2][3];
        md[0][0]=1;
        md[0][1]=2;
        md[0][2]=3;
        md[1][0]=11;
        md[1][1]=12;
        md[1][2]=13;
        //Basic dude
        // System.out.println( md[0][0]);
        // System.out.println( md[1][2]);

        //Another way
    /* String add[][]={{"Junita","samsohang","Nembang"},{"purna","Bahadur","Nembang"}};
       System.out.println(add[0][0]);
       System.out.println(add[0][1]); 
       int size=add.length;    
       System.out.println("size of add 2D array is"+" "+size);  */

       //By loop
       for(int i=0; i<md.length; i++){
        for(int j=0; j<md[i].length; j++){
              System.out.println(md[i][j]);
        }
       }
    }     
    static void Run(){
        int Age[]=new int[4];
        Age[0]=2;
        Age[1]=12;
        Age[2]=22;
        Age[3]=52;

        int i=0;
        while (i<Age.length) {
            System.out.println(Age[i]);
            i++;
        }  
    /*for(int each:Age)
    {
        System.out.println(each);    for each function similar like JS 
    }  */ 
  
    }
    public static void main(String[] args) {     
    //   Run();  
     Array1 a=new Array1();
     a.MultiD();

     
    }
}

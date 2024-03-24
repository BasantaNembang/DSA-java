import java.util.Arrays;
public class ArrayReference {   
    //Function to Print pass by array
    static void PassArray(int[] pin){
        for(int i=0; i<pin.length; i++){
            System.out.print(pin[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Original array
        int pin[]=new int[5];
        pin[0]=1;
        pin[1]=1;
        pin[2]=2;
        pin[3]=3;
        pin[4]=4;
        System.out.println("The original one");
        PassArray(pin);
        //To make different different memory in heap by reference
        //int pin2[]=pin.clone();  it is called clone method
        // int pin2[]=Arrays.copyOf(pin, pin.length);  Arrays is a class in java
        int pin2[]=pin;
        System.out.println("The Dublicate one");
        PassArray(pin2);
        //changing the value of pin2      
        pin2[0]=33;
        pin2[1]=33;
        System.out.println("after changing pin2 value this is pin");
        PassArray(pin);
        System.out.println("after changing pin2 value it is pin2 itself");
        PassArray(pin2);       
    }    
}

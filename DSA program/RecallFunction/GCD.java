public class GCD {
    static void f(){  //halka concept
        int divisionResult = 10 / 3; // divisionResult will be 3

        int moduloResult = 10 % 3;   // moduloResult will be 1
        System.out.println(divisionResult);
        System.out.println(moduloResult);
    }


    static int gcd(int a, int b){  //GCD is hcf
        if(b==0){
            return a;
        }
        return gcd(b, a%b);

    }
    public static void main(String[] args) {
       int n= gcd(18, 12);
       System.out.println(n);
    }
}

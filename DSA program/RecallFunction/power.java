public class power {
    static int F(int a, int b){   //For eg 5^4  gives 625
    if(b==0){
        return 1;
    }
    else{ 
        return F(a, b-1)*a;
    }
    }
    
    public static void main(String[] args) {
        System.out.println(F(5, 0));
    }
}

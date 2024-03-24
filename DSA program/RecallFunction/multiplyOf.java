public class multiplyOf {

    static void f(int x, int y){  //print multiply of eg (4,5)=4, 8, 12, 16, 20
        if(y==0){
            return;
        }
        f(x, y-1);
        System.out.println(x*y);
    }
     
    public static void main(String[] args) {
        f(3, 5);
    }
}

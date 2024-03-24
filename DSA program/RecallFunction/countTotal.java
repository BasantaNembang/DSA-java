public class countTotal {
//count the total number for eg 423 gives 9 output
static int cT(int a){
    if(a>=0 && a<=9){
        return a;
    }
    return cT(a/10)+(a%10);

}
    public static void main(String[] args) {
       int x= cT(18);
       System.out.println(x);
    }
}

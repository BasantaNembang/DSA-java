public class l {
    static int fc(int []x, int idx){
        if(idx == x.length-1){
            return x[idx];
        }
        int current = x[idx];
        int s = fc(x, idx+1);
        return current > s ? current : s;
    }

    public static void main(String[] args) {
        int l[] = {1, 4,66, 5, 6, 7};
        int largest = fc(l, 0);
        System.out.println("Largest element: " + largest);
    }
}
/*
 * if(largest>smallest){
 * return largest
 * }
 * else{
 * return smallest 
 * }
 * 
 * return largest>smallest ? largest:smallest;
 */

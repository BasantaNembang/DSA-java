
import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String p="953+4*6/-";
        Stack<Integer> val=new Stack<>();
        for(int i=0; i<p.length(); i++)
        {
            char e=p.charAt(i);
            int asv=(int)e;
            if(asv>=48 && asv<=57){
            val.push(asv-48);    }
            else {
                int v2=val.pop();
                int v1=val.pop();
                if(e=='+')val.push(v1+v2);
                if(e=='-')val.push(v1-v2);
                if(e=='*')val.push(v1*v2);
                if(e=='/')val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
    
}

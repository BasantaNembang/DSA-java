import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String s="-9/*+5346";
        Stack<Integer> val=new Stack<>();
        // reading from right to left
        for(int i=s.length()-1; i>=0; i--)
        { 
        char ch=s.charAt(i);
        int asv=(int)ch;
        if(asv>=48 && asv<=57){
        val.push(asv-48);    }
        else{
            int v1=val.pop();
            int v2=val.pop();
            if(ch=='+')val.push(v1+v2);
            if(ch=='-')val.push(v1-v2);
            if(ch=='*')val.push(v1*v2);
            if(ch=='/')val.push(v1/v2);
        }
        }
        System.out.println(val.peek());
    }
    
}

//package DSA program;

import java.util.Stack;

public class InfixE {
    public static void main(String[] args) {
        String str="9-5+3*4/6";
         Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
          char ch=  str.charAt(i);
            int asccv=(int)ch;
            if(asccv>=48 && asccv<=57) //check number
            val.push(asccv-48);
            else if (op.size()==0)
            op.push(ch);   
            else{
              if(ch=='+' || ch=='-')
              {
                int v2= val.pop();//bring value from stack
                int v1= val.pop();
                if(op.peek()=='-')val.push(v1-v2);  //work
                 if(op.peek()=='+')val.push(v1+v2);
                 if(op.peek()=='*')val.push(v1*v2);
                 if(op.peek()=='/')val.push(v1/v2);
                 op.pop();       //bring operator from stack
                   op.push(ch);   //push operator
              }
              if(ch=='*' || ch=='/')
              {
                if(op.peek()=='*'|| op.peek()=='/')  //if top most value is greater
                {
                  //work
                   int v2= val.pop();//bring value from stack
                   int v1= val.pop();
                   if(op.peek()=='/')val.push(v1/v2);
                   if(op.peek()=='*')val.push(v1*v2);
                    op.pop();         //bring operator
                   //push
                   op.push(ch);
                }
                else
                  op.push(ch);  //if lower priorty operator then direct psuh no need to work
                
              }
            }



          }
          while (val.size()>1) {

             int v2= val.pop();//bring value from stack
                int v1= val.pop();
                
                if(op.peek()=='-')val.push(v1-v2);  //work
                 if(op.peek()=='+')val.push(v1+v2);
                 if(op.peek()=='*')val.push(v1*v2);
                 if(op.peek()=='/')val.push(v1/v2);
                 op.pop();       //bring operator from stack
          }
        System.out.println(val.peek());
        } 
}

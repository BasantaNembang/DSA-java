import java.util.Stack;
public class InfixToPrefix {
    public static void main(String[] args) {
        String infix="9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String> val=new Stack<>();
        Stack<Character> ope=new Stack<>();
        for(int i=0; i<infix.length(); i++)
        {
          char ch=infix.charAt(i); 
          int asv=(int)ch;
            if(asv>=48 && asv<=57){
                 String p =""+ch;
                 val.push(p);
            }
              else if(ope.size()==0 || ch=='(' || ope.peek()=='(' )
              ope.push(ch);

              else if(ch==')')
              {
                while (ope.peek()!='(') {
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=ope.pop();
                    String u=o + v1 + v2;
                    val.push(u); 
                }
               ope.pop();
              }
              else{
                  if(ch=='+' || ch=='-')
                    {
                        String v2=val.pop();
                        String v1=val.pop();
                        char o=ope.pop();
                        String u=o + v1 + v2;
                        val.push(u);
                        ope.push(ch);
                        }

                        if(ch=='*' || ch=='/')
                        {
                            if(ope.peek()=='*' || ope.peek()=='/')
                            {
                                String v2=val.pop();
                                String v1=val.pop();
                                char o=ope.pop();
                                String u=o + v1 + v2;
                                val.push(u);
                                ope.push(ch);
                            }
                            else 
                            ope.push(ch);
                        }
                    }
        }
        while (val.size()>1) {
            String v2=val.pop();
            String v1=val.pop();
            char o=ope.pop();
            String u=o + v1 + v2;
             val.push(u);
        }
         String prefix=val.pop();
         System.out.println(prefix);
    }
}

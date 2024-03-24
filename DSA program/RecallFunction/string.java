public class string {
       //        String b="kamala";    //normal
//        string f=null;
//        StringBuilder r=new StringBuilder();
//        for(int i=0; i<b.length(); i++){
//              if(b.charAt(i)!='a'){
//                r.append(b.charAt(i));
//              }
//        }
//        System.out.println(r);
//       }   
// to concat a string append method is used;
          
        static String removeA(String s, int idx){  //remove the letter 'a' from the string
        if(idx==s.length()) {
              return "";
        }
          String done=removeA(s, idx+1);
          char prest=s.charAt(idx);
          if(prest!='a'){
              return prest+done;
          }
          else{
              return done;
          }
        }

        static String reserveS(String s, int idx){// reverse the given string
        if(idx==s.length()){
          return "";
        }
        String r=reserveS(s, idx+1);
        char curt=s.charAt(idx);
         return r+curt;
         }

       static boolean isPalindrome(String s, int frist, int last){  //check palindrome or not
       if(frist>=last){
            return true;  }
       return(s.charAt(frist)==s.charAt(last) && isPalindrome(s, frist+1, last-1));
       }
       public static void main(String[] args){
              String N="abba";
             //System.out.println(removeA(N, 0));
          /*   String rev=reserveS(N, 0);    //equals method is used to measure the String in java
            if(N.equals(rev)){
              System.out.println("Given string is palindrom");
            }else{
              System.out.println("Not a palindrom");
            }  */
            int t=N.length();
            boolean r=isPalindrome(N, 0, t-1);
            System.out.println(r);
       }
          
}


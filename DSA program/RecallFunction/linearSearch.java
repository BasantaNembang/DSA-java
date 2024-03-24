public class linearSearch {

    static boolean serarch(int []any, int tagrget, int idx){  //return ture or false
       //base case
      if(any[idx]==any.length){
        return false;
      }
      if(tagrget==any[idx]) return true;
       return serarch(any, tagrget, idx+1); 
    }

    static int findIdx(int []any, int tagrget, int idx){  //return idx number or -1
       if(idx==any.length)
        return -1;     
       if(tagrget==any[idx])
            return idx; 
      return findIdx(any, tagrget, idx+1);       
    }

    static void allIdx(int []any, int tagrget, int idx){  //return all the indexsss
       if(idx==any.length)  return;
       if(any[idx]==tagrget) System.out.println(idx);
       allIdx(any, tagrget, idx+1);
    }
    public static void main(String[] args) {
        int []nembang={1,23,45,7,10,2,2,2};
     //System.out.println(serarch(nembang, 1, 0));
    // System.out.println(findIdx(nembang, 0, 0));
     allIdx(nembang, 2, 0);
    } 
    
}

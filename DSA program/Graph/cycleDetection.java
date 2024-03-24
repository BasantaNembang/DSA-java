package Graph;

import java.util.ArrayList;

//Direted garph
public class cycleDetection {

    public static class edge{
        int s;
        int d;
        edge(int s, int d){
            this.s=s;
            this.d=d;
        }
    }
    //make a garph
    public static void makeGarph( ArrayList<edge> garph []){
        for(int i=0; i<garph.length; i++){
           garph[i]=new ArrayList<>();
        }
        //now add
        garph[1].add(new edge(1, 0));

        garph[0].add(new edge(0, 2));

        garph[2].add(new edge(2, 3));

        garph[3].add(new edge(3, 1));

    }

   //Cycle or not
   public static boolean isCycle(ArrayList<edge> garph[], boolean [] check, boolean [] tarck, int curr){
    check[curr]=true;
    tarck[curr]=true;
    for(int i=0; i<garph[curr].size(); i++){
        edge f=garph[curr].get(i);
        if(tarck[f.d]==true){
            return true;
        }else if(check[f.d]==false){
            if(isCycle(garph, check, tarck, f.d)){
            return true;  }
        }
    }
    tarck[curr]=false;
    return false;
   }
   
    public static void main(String[] args) {
        /*
        1------>0<-----3
                |     / to
                |    /
                to  /
                   /    
                24;
         */
        int v=4;
        int frist=0;
        ArrayList<edge> garph[]=new ArrayList[v];
        makeGarph(garph);
        //cycle
        boolean check[]=new boolean[v];
        boolean tarck[]=new boolean[v];
        for(int i=0; i<v; i++){
            if(check[i]==false){
                boolean rs=isCycle(garph, check, tarck, frist);
                if(rs==true){
                  System.out.println(rs);
                  break;
                } 
            }                    
        }     
      }   
    }

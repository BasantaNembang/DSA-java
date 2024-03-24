package Graph;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
public class Traverse {
    //
    //Bread frist search(bfs)
    public static class edge{
        int source; 
        int distination;
        edge(int src, int disc){
            this.source=src;
            this.distination=disc;
        }      
    } 
    //create a graph
    public static void createGraph(ArrayList<edge> garph[]){
      for(int i=0; i<garph.length; i++){
        garph[i]=new ArrayList<>();
      }
      //now add
      garph[0].add(new edge(0, 1));
      garph[0].add(new edge(0, 2));
  
      garph[1].add(new edge(1, 0));
      garph[1].add(new edge(1, 3));

      garph[2].add(new edge(2, 0));
      garph[2].add(new edge(2, 4));

      garph[3].add(new edge(3, 1));
      garph[3].add(new edge(3, 4));
      garph[3].add(new edge(3, 5));

      garph[4].add(new edge( 4, 2));
      garph[4].add(new edge( 4, 3));
      garph[4].add(new edge( 4, 5));

      garph[5].add(new edge(5, 3));
      garph[5].add(new edge(5, 4));
      garph[5].add(new edge( 5, 6));

      garph[6].add(new edge( 6, 5));
    }

      //now print okey basanta
      public static void printA( ArrayList<edge> garph[], int whom){
      for(int i=0; i<garph[whom].size(); i++){
        edge anyOne=garph[whom].get(i);
        System.out.print(anyOne.distination+" ");
      }
      }
      //Traverse the garph
      public static void traverseArry( ArrayList<edge> garph[], int n, int frist, boolean check[]){
      Queue<Integer> q =new LinkedList();
      q.add(frist);
      while (!q.isEmpty()) {
        int curr=q.remove();
        if(check[curr]==false){
            System.out.print(curr+" ");
            check[curr]=true;
            //now adds its neighbour to the qeue
            for(int i=0; i<garph[curr].size(); i++){
                edge f=garph[curr].get(i);
                q.add(f.distination);
            }
        }
      }
      }

      // All the path   by DFS
      public static void printALLPath(ArrayList<edge> garph[], int start, int target, String path, boolean check[]){
       if(start==target){
        System.out.println(path);
        return;
       }
         check[start] = true; 
          //now call the neighbour
          for(int i=0; i<garph[start].size(); i++){
               edge fst=garph[start].get(i);
              if(check[fst.distination]==false){    
               printALLPath(garph, fst.distination, target, path+"->"+fst.distination, check);        
            }
        }
   check[start] = false;
      }
      public static void main(String[] args) {
          /*
            1------3
           /       | \
         0         |   \ 5---6
           \       |   /
            \      | /
             2-----4
            graph
             */ 
         int n=7;    
         ArrayList<edge> garph[]=new ArrayList[n];
         createGraph(garph);
        //  printA(garph, 6);  //it will print its distination
        //tarverse
      /*   boolean check[]=new boolean[n];
        for(int i=0; i<garph.length; i++){
        if(check[i]==false){
            int curr=i;
            traverseArry(garph, n,curr, check);
        }  */
        //
        //Traverse ALl the path
        int frist=0;
        int target=5;
        boolean[] check = new boolean[n];
        printALLPath(garph, frist, target, "0", check);
       }
      }

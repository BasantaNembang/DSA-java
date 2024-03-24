package Graph;
import java.util.ArrayList;
public class BellmanFord {
  public static class edge{
         int s;
         int d;
         int w;
         edge(int s, int d, int w){
           this.s=s;
           this.d=d;
           this.w=w;
         }
     }
      //make garph
     public static void makeGraph(ArrayList<edge> garph[]){
     for(int i=0; i<garph.length; i++){
           garph[i]=new ArrayList<>();
     }
 
      garph[0].add(new edge(0, 1, 2));
      garph[0].add(new edge(0, 2, 4));
    
      garph[1].add(new edge(1, 2, -4));
 
      garph[2].add(new edge(2, 3, 2));
     
      garph[3].add(new edge( 3, 4, 4));
 
      garph[4].add(new edge(4, 1, -10));   
     }
 
     //
     public static void bellmanAlgorithm( ArrayList<edge> garph[], int v, int scr){
       int dist[]=new int[v];
       for(int i=0; i<v; i++){
         if(i==scr){
           dist[i]=0;
         }else{
         dist[i]=Integer.MAX_VALUE;
         }
       }
 
        for(int i=0; i<v-1; i++){
                             
          for(int j=0; j<v; j++){  
              for(int k=0; k<garph[j].size(); k++){
                   edge f=garph[j].get(k);
                    int b=f.s;
                    int n=f.d;
                   
                   if(dist[b]!=Integer.MAX_VALUE && dist[b]+f.w<dist[n]){
                      dist[n]=dist[b]+f.w;
                   }
              }
            }
         }   
         //detect -ve cycle
         for(int j=0; j<v; j++){  
          for(int k=0; k<garph[j].size(); k++){
               edge f=garph[j].get(k);
                int b=f.s;
                int n=f.d;
               
               if(dist[b]!=Integer.MAX_VALUE && dist[b]+f.w<dist[n]){
                    System.out.println("Negative Cycle DETECT");               }
          }
        } 
      //Print       
     for(int s=0; s<dist.length; s++){
       System.out.print(dist[s]+" ");
     }
     }
        public static void main(String[] args) {
         /*
            to) 1 < -----  -1
        2  /    |         \
          /     | -4       4 /to)4
         0      to        /
       4  \to)  2------->3
                    2
          */
     int v=5;
     ArrayList<edge> garph[]=new ArrayList[v];
     makeGraph(garph);
     bellmanAlgorithm(garph,  v, 0);
          } 
 }
package Graph;
//make garaph
//adjacent list representation
import java.util.ArrayList;

//Graph bidirectional and unweighted in case of weighted we add wtt
public class simpleG {

    public static class edge{
        int src;   //source
        int dist;  //distination
        int wgt;   //weight
        edge(int s, int d, int w){
            this.src=s;
            this.dist=d;
            this.wgt=w;
        }     
    }
       
    public static void creatGraph( ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
        }
        //now add
        graph[0].add(new edge(0, 2,1));

        graph[1].add(new edge(1, 2,4));
        graph[1].add(new edge(1, 3,5));

        graph[2].add(new edge(2, 0,2));
        graph[2].add(new edge(2, 3,3));
        graph[2].add(new edge(2, 1,3));

        graph[3].add(new edge(3, 2,1));
        graph[3].add(new edge(3, 1,3));


    }
    public static void main(String[] args) {
      /*
         0     3
         |   /  |
         | /    |
         2------1
           */

        int n=4;
        ArrayList<edge> graph[]=new ArrayList[n];
        creatGraph(graph);
        //print
        for(int i=0; i<graph[2].size(); i++){
            edge e=graph[2].get(i);
            System.out.println(e.dist+" " +" "+e.wgt+" ");
        }
    }
    
}

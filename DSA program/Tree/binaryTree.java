package Tree;
import java.util.LinkedList;
import java.util.Queue;
public class binaryTree {
    static class Node{
      int data;
      Node left;
      Node right;
      public Node(int data){
        this.data=data;
      }
    }
    //Making the Tree
     static class bTrees{                                                     
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
          if(nodes[idx]==-1){
                return null;
          }
         Node newNode=new Node(nodes[idx]);
         newNode.left=buildTree(nodes);
         newNode.right=buildTree(nodes);
         return newNode;
         }
    }

    //Traverse the root
    public static void preOrder(Node root){
      if(root==null){
        return;
      }
      System.out.print(root.data+" ");
      preOrder(root.left);
      preOrder(root.right);
    }

    public static void  inOrder(Node root){
      if(root==null){
        return;
      }
      inOrder(root.left);
      System.out.print(root.data+" ");
      inOrder(root.right);
    }

    public static void postOrder(Node root){
      if(root==null){
        return;
      }
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
     if(root==null){
      return;
     }
     Queue<Node> q=new LinkedList<>();
     q.add(root);
     q.add(null);

     while (!q.isEmpty()) {
      Node curr=q.remove();
      if(curr==null){
        System.out.println();
             if(q.isEmpty()){
                    return;
                         }else{
                          q.add(null);
                         }
      }else{
          System.out.print(curr.data+" ");
          if(curr.left!=null){
              q.add(curr.left);
          }  if (curr.right!=null) {
             q.add(curr.right);
          }
      }
         }
    }

    public static int countTree(Node root){
      if(root==null){
        return 0;
      }
      int leftNode=countTree(root.left);
      int rightNode=countTree(root.right);
      return leftNode+rightNode+1;
    }

    public static int heightTree(Node root){
      if(root==null){
        return 0;
      }
      int leftHight=heightTree(root.left);
      int rightHight=heightTree(root.right);
      if(leftHight>rightHight){
        return leftHight+1;
      }else{
        return rightHight+1;
      }
    }
   
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
          bTrees tree=new bTrees();
          Node root=tree.buildTree(nodes);
        //   System.out.println(root.data);
        //   System.out.println();
        //  preOrder(root);
        // postOrder(root); 
        //  levelOrder(root);
        // int cuntt=countTree(root);
        // System.out.println(cuntt);
        System.out.println(heightTree(root));
    }
}

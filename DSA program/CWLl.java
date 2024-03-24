public class CWLl {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    //Display Node
    public static void display(Node head){
        Node  temp=head;
        while(temp!=null) {
            System.out.print(temp.data+ "->");
            temp=temp.next; 
        }
    }
    //Count Node
    public static int VluNd(Node head){
        int count=0;
        while(head!=null) {
        count ++;
        head=head.next;
    }
    return count;
    }
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(5);
        Node c=new Node(7);
        Node d=new Node(12);
        Node e=new Node(17);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(e.next);
       //display(a);
      System.out.println(VluNd(a));
    } 
}

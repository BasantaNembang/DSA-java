public class DoubleList {
    public static class Node{
               int data;
               Node prev;
               Node next; 
               Node(int data){//constructor
                this.data=data;
               }
    }
    public static void printAll(Node head){//Print all the data
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;   
        }
    }
    public static void reversData(Node tail){//Reverse the data
      Node temp=tail;
      while (temp!=null) {
        System.out.print(temp.data + " ");
        temp=temp.prev;
      }
    }

    public static void printAnyway(Node any){//Print serially 
      Node temp=any;
      while (temp.prev!=null) {
        temp=temp.prev;
      }
      //now temp is Head
      while (temp!=null) {
        System.out.print(temp.data + " ");
        temp=temp.next;
        
      }
    }
    public static void main(String[] args) {
        //4 5 7 9 10
        Node a=new Node(4);
        Node b=new Node(5);
        Node c=new Node(7);
        Node d=new Node(9);
        Node e=new Node(10);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
       //printAll(a);
       //System.out.println();
       //reversData(e);
      printAnyway(c);
      
       
        
    }
    
}

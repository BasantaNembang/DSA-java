public class ExLinked {
    Node head;
    //class
   class Node{
    String data;
    Node next;
   //constructor
   Node(String data)
   {
    this.data=data;
    this.next=null;
   }
   } 
   //add data in first
    public void addFirst(String data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
         head=newnode;
         return;
         }
         newnode.next=head;
         head=newnode;
    }
   //add last
   public void addLast(String data)
   {
     Node newnode=new Node(data);
     if(head==null){
        head=newnode;
        return;
     }
     Node cussnode=head;
     while (cussnode.next!=null) {
        cussnode=cussnode.next; 
     }
     cussnode.next=newnode;
   }
   //print
   public void print()
   {
    if(head==null)
    {
        System.out.println("Stack is empty");
        return;
    }
     Node cussnode=head;
     while (cussnode!=null) {
        System.out.println(cussnode.data);
        cussnode=cussnode.next; 
     }
    System.out.println("Null");
   }
   public static void main(String[] args) {
    ExLinked rr=new ExLinked();
    rr.addFirst(" b");
    rr.addFirst("is");
    rr.print();
   }  
} 

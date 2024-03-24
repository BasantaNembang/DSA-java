
public class DoubleListN {
    public static class Node{
       Node next;
       Node prev;
       int data;
       Node(int data){
        this.data=data;
       }
    }
   public static class DList{
     Node head=null;
     Node tail=null;
     Node prev=null;
      int size=0;
      //methods
      public  void addAtlast(int data){ //add at last
        Node lst=new Node(data);
        if(size==0){//check empty or not
           head=lst;
           tail=lst;
        }
        else{
        tail.next=lst;
        lst.prev=tail;
        tail=lst;
        }
        size++;
      }
      public void printList(){//print the data
       Node temp=head;
       while (temp!=null) {
        System.out.print(temp.data+" ");
        temp=temp.next;
       }System.out.println();
      }
      public void addHead(int data){//insert at head
        Node temp=head;
        Node fst=new Node(data);
        if(head==null){
            head=fst;
            tail=fst;
        }
        else{
            fst.next=head;
            head.prev=fst;
            head=fst;
        }
        size++;
      }
      public void atAny(int idx, int data){    //insert at any index
          Node temp=head;
          Node any=new Node(data);
          if(idx==0){
            addHead(data);
            return;
          }
          if(idx==size){
            addAtlast(data);
            return;
          }
          if(idx<0 || idx>size){
            System.out.println("No");
            return;
          }
        
           for(int i=0; i<idx-1; i++){
            temp=temp.next;
           }
          temp.next.prev=any;
          any.prev=temp;
          any.next=temp.next;
          temp.next=any;
          size++;
      }
      public void delectAt(int idx){//delect at
        Node temp=head;
        if(idx==0){  //dlecte at head
          temp=temp.next;
          head=temp;
          head.prev=null;
          return;
        }
        if(idx==size){    //delecte at end
          Node t=tail;
          t=t.prev;
          t.next=null;
          tail=t;
          return;
        }
        if(idx>size || idx<0){  //delect outof range
          System.out.println("whatever");
          return;
        }
        for(int i=0; i<idx-1; i++){
          temp=temp.next;
        }
        temp.next=temp.next.next;
        if(temp.next!=null){
        temp.next.prev=temp;}
        else{
          tail=temp;
        }
        size--;
    }   
   } 
    public static void main(String[] args) {//Doubly link list
       DList dl=new DList();
       dl.addAtlast(8);
       dl.addAtlast(18);
       dl.addHead(6);
       dl.atAny(1,23);
       dl.atAny(3,3);
       dl.atAny(0,13);
     //  dl.printList();
       dl.delectAt(5);  
       dl.printList();
       dl.delectAt(2);
       dl.printList();
       System.out.println("Head/tail is"+"   "+dl.head.data);
       System.out.println("size"+" "+dl.size);
    }
}

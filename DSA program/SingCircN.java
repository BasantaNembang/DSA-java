public class SingCircN {
    public static class Node {
      int data;
      Node next;
      Node(int data){
        this.data=data;
      } 
    }   
      public static class Cl{
        Node head;
        int length=0;
        public void addLast(int data){//inset at last
        Node l=new Node(data);
        if(head==null){
            l.next=l;
            head=l;
        }
        else{
           Node temp=head;
           while (temp.next!=head) {
             temp=temp.next;
           }
           temp.next=l;
           l.next=head;
        }
        length++;
        }
        public void disP(){  //print data
            Node temp=head;
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp!=head);
            System.out.println();
        }
        public void addF(int data){ //add to head
        Node temp=head;
        Node f=new Node(data);
        if(head==null){
            f.next=f;
            head=f;
        }
       else{
        while (temp.next!=head) {
            temp=temp.next;      
        }
           f.next=head;
           head=f;
           temp.next=head;
       }
        length++;
        }
        public void insertAt(int idx,int data){ //index
             Node temp=head;
            Node r=new Node(data);
            for(int i=1; i<=idx-1; i++){
                temp=temp.next;
            }
            r.next=temp.next;
            temp.next=r;
            length++;
        }
        public void delectHead(){//delete head
        Node t=head;
       while (t.next!=head) {
          t=t.next;
       }
       //now i am in tail
      head=head.next;
      t.next=head;

        length--;
        }
        public void delectTail(){//delete tail
            Node t=head;
            Node prev = null;
            /* for(int i=0; i<length; i++){
                prev = t;
                t=t.next;
            }
            t.next=null;
            //now t is at tail and prev is at second last node
            prev.next = head; //update the next pointer of second last node to head
            t.next=null; */
           while (t.next!=head) {
                   prev=t;
                   t=t.next;
           }
           //now t is tai
           t.next=null;  //now here tail referce to null and sec last(prev) node ref to the head
           prev.next=head;
            length--;
        }
        
       public void delectIndex(int idx){  //delect by choices
        Node t=head;
        if(idx==0){
            delectHead();
            return;
        }
        if(idx==length){
            delectTail();
            return;
        }
        if(idx>length || idx<0){
            System.out.println("Kuch vi vai");
            return;
        }
        for(int i=1; i<=idx-1; i++){
            t=t.next;
        }
         t.next=t.next.next;
         length--;
       }
      }
   public static void main(String[] args) {
    //circular link list 
    Cl a=new Cl();
    a.addLast(9);
    a.addLast(10);
    a.addF(8);
    a.addF(4);
    a.insertAt(2,7);
    a.addLast(12);
    a.disP();
    System.out.println("lenght"+" "+a.length);
    a.delectIndex(6);
    a.disP();
    a.delectTail();
    a.disP();
   }
}
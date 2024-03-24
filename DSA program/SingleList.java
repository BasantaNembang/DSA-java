public class SingleList 
{
    public static class Node{
        int  data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class List{
        Node head=null;
        Node tail=null;

        void insertatlast(int data){  //Insert the data at last
            Node temp = new Node(data);
          if(head==null){
            head=temp;
          }
          else{
            tail.next=temp;
          }
          tail=temp;
        }

        void insertAtstart(int data){//Insert the data at first
          Node naya=new Node(data);
          if(head==null){
            head=naya;
            tail=naya;
          }
          else{
            naya.next=head;
            head=naya;
          }
         }
         void insertAt(int idx,int data)//Insert at any index
         {
          Node atpoint=new Node(data);
          Node temp=head;
          if(idx==size()){
            insertatlast(data);
            return;
          }
          else if(idx==0){
            insertAtstart(data);
          }
          else if(idx<0 || idx>size()){
            System.out.println("Its not possible dude");
            return;
          }
          for(int i=0; i<idx-1; i++){
            temp=temp.next;
          }
          atpoint.next=temp.next;
          temp.next=atpoint;
         }

         //Print element at any Index
         int getElementAt(int idx){
          Node t=head;
          if(idx<0 || idx>size()){
            System.out.println("wrong index");
            return -1;
          }
          else{
          for(int i=0; i<idx; i++){
            t=t.next;
          }
          return t.data;}
         }
        //display the data
        void display() {
            Node t=head;
              while (t!=null) {
              System.out.print(t.data+" ");
                t=t.next;    }
                System.out.println("");
        }
        //Size 
        int size(){
          Node temp=head;
          int count=0;
          while (temp!=null) {
            count++;
           temp= temp.next;
          }
          return count;
        }
        void delectAt(int idx){
          Node temp=head;
          for(int i=0; i<idx-1; i++){
             temp=temp.next;
          }
          temp.next=temp.next.next;
        }
       } 
  public static void main(String[] args) {
    List r=new List();
   r.insertatlast(5);
   r.insertatlast(6);
   r.insertatlast(7);
   r.insertatlast(8);
   //r.display();
   r.insertAtstart(4);
   r.insertAtstart(2);
   //r.display();
   r.insertatlast(10);
   r.insertAtstart(0);
   r.display();
   r.insertAt(2, 4);
   r.display();
   r.insertAt(1, 1);
   //r.display();
   //System.out.println(r.size());
   r.insertAt(10, 12);
  //  r.display();
  //  int l=r.tail.data; 
  // System.out.println(l);
  r.insertAt(0, 12);
  r.display();
  // System.out.println(r.head.data);
  //
  //r.insertAt(-23, 01);
  //r.display();
  //System.out.println( r.getElementAt(-122));
  r.delectAt(2);
  r.display();

 }
}

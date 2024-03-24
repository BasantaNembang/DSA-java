public class ExpensiveDll {
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Dll{
        Node head=null;
        Node prev=null;
        Node tail=null;
        int size=0;
        public  void addItem(int data){//add item at last
            Node last=new Node(data);
           if(size == 0){
            head=last;
            tail=last;
           }
           else{
            last.prev = tail;
            tail.next = last;
            tail = last;
           }
            size++;
        }
         void printDll(){//print 
            Node temp =head;
            while (temp!=null) {  
                System.out.print(temp.data+ "->");    
                temp=temp.next;      
            }
            System.out.println();
         }
         void insertHead(int data){//Add to frist
            Node frst=new Node(data);
            if(size==0){
                head=frst;
                tail=frst;
            }
            else{
                frst.next=head;
                head.prev=frst;
                head=frst;
            }
            size++;
         }
         void insertAtIndex(int idx, int data){//Enter at any index
            Node temp=head;
            Node index=new Node(data);
            if(idx==0){
                insertHead(data);
                return;
            }
            if(idx==size){
                addItem(data);
                return;
            }
            for(int i=0; i<idx-1; i++){
                temp=temp.next;
            }
                temp.next.prev=index;
                index.prev=temp;
                index.next=temp.next;
                temp.next=index;
                size++;
                System.out.println();
         }
         void delectHead(){// Delect Head
            head=head.next;
            head.prev=null;
             size --;
         }
         void delectTail(){//Delect Tail
          tail= tail.prev;
          tail.next=null;
            size --;
         }
         void delectAt(int idx){ // Delect at any Index
            Node temp=head;
            if(idx==0){
                delectHead();
                return;
            }
            else if(idx==size){
               delectTail();
               return;
            }
            for(int i=0; i<idx-1; i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;    
            size--;
         }   
    }
    public static void main(String[] args) {
        Dll a=new Dll();
        a.addItem(4);
        a.addItem(8);
        a.insertHead(2);
        a.insertHead(1);
       // a.printDll();
        a.insertAtIndex(2, 3);
        a.insertAtIndex(0,0);
        a.insertAtIndex(6,12);
        a.printDll();
        a.delectAt(7);
        a.delectAt(6);
        a.printDll();
        System.out.println("Size of list" +" " +a.size);
        System.out.println( "Head/Tail of list" + " "+a.tail.data);
    } 
}

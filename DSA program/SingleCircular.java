public class SingleCircular {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class SC{
        Node head=null;
        int size=0;

        public void addItem(int data){ //add at last
            Node last=new Node(data);
                 if(head==null){
                    last.next=last;
                    head=last;
                 }
                 else{
                   Node temp=head;
                   while(temp.next!=head){
                    temp=temp.next;
                   }
                   temp.next=last;
                   last.next=head;
                 }
                 size++;
        }
        public void printData(){ //Print the data
           Node temp=head;
           do{
            System.out.print(temp.data+" ");
            temp=temp.next;
           }while(temp!=head);
    }

    public void addHead(int data){//Insert at head
        Node frst=new Node(data);
             if(head==null){
                 frst.next=frst;
                 head=frst;
             }
             else{
                Node temp=head;
                while (temp.next!=head) {
                    temp=temp.next;      
                }
                  frst.next=head;
                  head=frst;
                  temp.next=head;
             }
             size++;
    }

    }
    public static void main(String[] args) {
        SC sc=new SC();
        sc.addItem(2);
        sc.addItem(8);
        sc.addItem(12);
        sc.addItem(16);
        sc.addHead(1);
        sc.addHead(0);
       // System.out.println(sc.size);
        sc.printData();
        System.out.println("/Head"+" "+sc.head.data);
        System.out.println();
        System.out.println(sc.size);
    }
    
}

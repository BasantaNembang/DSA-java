public class ManyDays {
    public static class Node{
        int data;
        Node next;
       Node(int data){
       this.data=data;
       }
    }
    public static class link{
        Node head=null;
        Node tail=null;
        int size=0;
        void addList(int data){  //add at last
        Node temp=new Node(data);
        if(head==null){
           head=temp;  
        }
        else{
            tail.next=temp;
        }
        tail=temp;
        size++;
        }
        void addFrist(int data){//Add to Frist
         Node frst=new Node(data);
         if(head==null){
             addList(data);
             return;
         }
         else{
            frst.next=head;
            head=frst;
            size++;
         }
         
        }
        void printData(){ //Print the data
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data + " ");
                temp=temp.next;  
            } 
        }

       /*int size(){//size of list
        int count=0;
        Node temp=head;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        System.out.println("");
        return count;
       }
       
      int size(){ //size
        System.out.println("");
        return size;
      } */
      void delectAt(int idx){ //Delect
        
        if(idx==0){
          head=head.next;
          size--;
          return;
        }
        else if(idx<0 || idx>size){
          System.out.println("Not Happen");
          return;
        }
        Node temp=head;
        for(int i=0; i<idx-1; i++){
           temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
        size--;
      }
       void inserAt(int idx, int data){//Enter any any index
        Node top=head;
        Node naya=new Node(data);
        if(idx==0){//at 0 index
            addFrist(data);
            System.out.println("");
            return;
        }
        else if(idx==size){//at total number okey
            addList(data);
            return;
        }
       else if(idx<0 || idx>size){
        System.out.println("wrong index");
        return;
       }
       else{
        for(int i=0; i<idx-1; i++){
            top=top.next;
           
        }
        naya.next=top.next;
        top.next=naya;
        size++;
        System.out.println("");
        
       }
       
    }

    void printAtindex(int idx){//Print at any index
        Node temp=head;
      if(idx==0){
        System.out.println("");
        System.out.println(temp.data);
        return;
      }
      else if(idx>size||idx<0)
      {
        System.out.println("No man");
        return;
      }
       else{ for(int i=0; i<idx-1; i++){
            temp=temp.next;
        }
        System.out.println("");
        System.out.println(temp.next.data);
      }

    }
    

    public static void main(String[] args) {
        link l=new link();
      // l.addList(3);
      // l.addList(4);
      // l.addFrist(2);
      // l.addFrist(1);
       //l.printData();
     //  System.out.println(l.size());
      // l.inserAt(2, 8);
     //  l.printData();
       //l.inserAt(3, 10);
       //l.printData();
      //  l.inserAt(0, 9);
      //  l.inserAt(7, 12);
      //  l.printData();
     //  System.out.println("");
      // l.inserAt(5, 12);
     //l.printData();
     //l.printAtindex(1);
    //   System.out.println(l.size);
    l.addList(2);
    l.addList(3);
    l.addList(4);
    l.addFrist(1);
    l.inserAt(4,7);
    l.inserAt(0,5);
    l.inserAt(5,5);
    l.addList(15);
    l.addFrist(8);
    l.delectAt(3);
    l.delectAt(-1);
    l.printData();
    System.out.println();
    System.out.println(l.size);
    //System.out.println(l.tail.data);
    }  
}
}


package commanDSA;
public class circularQueue {
    int n = 5; // Size of the circular queue
    int[] queue = new int[n];
    int front = -1; // Initialize front and rear pointers
    int rear = -1;

    // Method to add an element to the circular queue
    void enQueue(int x) {
        if ((rear + 1) % n == front) {
            System.out.println("Queue is Full!");
            return;
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % n;
        }
        queue[rear] = x;
    }
   //Void print
    void printQ(){
        int i=front;
        if(front==-1 && rear==-1){
            System.out.println("Empty!");
            return;
        }
        else{
            while (i!=rear) {
              System.out.println(queue[rear]);     
              i=(i+1)%n;          
            }
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        circularQueue cq = new circularQueue();
        cq.enQueue(3);
        cq.printQ();
    }
}




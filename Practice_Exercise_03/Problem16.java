package Practice_Exercise_03;

public class Problem16 {
    public static class Queue{
        private int size;
        private int[] array;
        private int rear;
        private int front;

        public Queue(int n){
            size = n;
            array = new int[size];
            rear = -1;
            front = -1;
        }
        public boolean isEmpty(){
            if(rear == -1 && front == -1){
                return true;
            }
            else{
                return false;
            }
        }
        public boolean isFull(){
            if(front==0 && rear == size-1){
                return true;
            }
            else{
                return false;
            }
        }
        public void enqueue(int n){
            if(isFull()){
                System.out.println("Queue is Full!");
            }
            else{
                if(front == -1){
                    front = 0;
                }
                rear++;
                array[rear] = n;
            }
        }
        public int dequeue(){
            int a = -1;            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            else{
                if(front >= rear){
                    front = -1;
                    rear = -1;
                }
                else{
                    a = array[front];
                    System.out.println("Dequeued : "+a);
                    front++;
                }
            }
            return a;
        }

        public int peek(){
            int a;
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            else{
                a = array[front];
            }
            return a;
        }

        public void print(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            for(int i=front; i<=rear; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Queue q = new Queue(8);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.print();
        System.out.println(q.isFull());
        System.out.println("Front Element: "+q.peek());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.print();

        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println("Front Element: "+q.peek());
    }
}

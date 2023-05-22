package Practice_Exercise_03;

public class Problem15 {
    public static class stack{
        private int [] array;
        private int top;
        private int size;

        public stack(int n){
            this.top = -1;
            this.size = 0;
            this.array = new int[n];
        }
        public void push(int a){
            if(isFull()){
                System.out.print("Stack is Over-flowed");
            }
            else {
                this.array[this.size++] = a;
                this.top++;
            }
        }
        public void pop(){
            if(isEmpty()){
                System.out.print("Stack is under-flowed");
            }
            else {
                System.out.println("Popped : "+this.array[this.top]);
                this.array[this.top--] = -1;
                this.size--;
            }
        }

        public boolean isEmpty(){
            if(this.size == 0){
                return true;
            }
            return false;
        }
        public boolean isFull(){
            if(this.size == array.length){
                return true;
            }
            return false;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return this.array[this.top];
        }

        public void print(){
            if(this.size == 0){
                System.out.println("\nStack is Empty");
            }
            else {
                for (int i = this.top; i >= 0; i--) {
                    System.out.print(this.array[i] + " ");
                }
            }
        }
        public int stack_size(){
            return this.size;
        }
    }
    public static void main(String[] args){
        stack s = new stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.print();
        s.stack_size();

        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.push(25);

        s.print();
        s.stack_size();
        s.peek();


    }

}

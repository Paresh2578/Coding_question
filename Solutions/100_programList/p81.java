import java.util.Stack;

class QueueUsingStack{
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueUsingStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int n){
        System.out.println(stack2);
        stack1.push(n);

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        Stack<Integer> temp =stack2;
        stack2 = stack1;
        stack1 = temp;

        System.out.println(stack2);
    }

    public int peek(){
        return stack2.peek();
    }

    public int dequeue(){
        return stack2.pop();
    }

    public boolean isEmpty(){
        return stack2.isEmpty();
    }
    
}

class p81{
    public static void main(String[] args){

        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek()); // Output: 10

        System.out.println("Dequeued element: " + queue.dequeue()); // Output: 10
        System.out.println("Dequeued element: " + queue.dequeue()); // Output: 20

        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false

        System.out.println("Dequeued element: " + queue.dequeue()); // Output: 30
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
    }
}
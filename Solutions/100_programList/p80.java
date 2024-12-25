import java.util.LinkedList;
import java.util.Queue;

class stackUsingQueue{
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public stackUsingQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }


    public void push(int n){
        queue1.add(n);

        // tranfrom all value 2 to 1
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }

        Queue<Integer> temp = queue2;
        queue2 = queue1;
        queue1 = temp;
    }

    public int peek(){
        return queue2.peek();
    }

    public int pop(){
        return queue2.poll();
    }

    public boolean isEmpty(){
        return queue2.isEmpty();
    }
}

public class p80 {
    public static void main(String[] args) {

        stackUsingQueue stack = new stackUsingQueue();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Output: 30

        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        System.out.println("Popped element: " + stack.pop()); // Output: 10
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}

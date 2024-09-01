// p38 ) AP to add an element into already sorted singly linked list. 

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class p38 {
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        }
        // 1 , 2 ,5 , 7
        //3
        else{
             // Case 2: Traverse the list and find the correct position to insert the new node
             Node current = head;
             while (current.next != null && current.next.data < newNode.data) {
                 current = current.next;
             }
             newNode.next = current.next;
             current.next = newNode;
        }
    }

       // Function to display the linked list
       public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        p38 list = new p38();
        //3 , 8 , 
        list.insert(8);
        list.insert(3);
        list.insert(5);
        list.insert(2);
        list.insert(2);

        list.display();
    }
}

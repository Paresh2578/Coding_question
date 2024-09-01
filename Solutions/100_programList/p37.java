// 37 ) WAP to sort a number in ascending order in singly linked list.  

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class p37 {
    Node head;

    // Function to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Function to sort the linked list using bubble sort
    public void sort() {
        if (head == null) {
            return;
        }

        Node current, index;
        int tempData;

        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.data > index.data) {
                    // Swap data
                    tempData = current.data;
                    current.data = index.data;
                    index.data = tempData;
                }
            }
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
        p37 list = new p37();

        // Inserting elements into the linked list
        list.insert(3);
        list.insert(1);
        list.insert(4);
        list.insert(2);

        System.out.println("Linked List before sorting:");
        list.display();

        // Sorting the linked list
        list.sort();

        System.out.println("Linked List after sorting:");
        list.display();
    }
}

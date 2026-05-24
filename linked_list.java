// Create a Linked List Containing Values from 1 to N 

// 1.Create a first node head with value 1.
// 2.Use a pointer temp to keep track of last node.
// 3.Loop Start From 2 to N.
//   ~For each value create new node.
//   ~ Attach it to temp.next
//   ~ Move Temp forward
// 4.Return Head.
// Ques. Write a function to print linked list.







//create a linked list containg a values from 1 to N 
//write a function to print a linkedlist
//tamp=null
//print tamp.data
class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linked_list {

    public static Node createLL(int n) {
        if (n <= 0) return null;

        Node head = new Node(1);
        Node temp = head;

        for (int i = 2; i <= n; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        return head;
    }
}


if (linked list !=null)
{
    
}
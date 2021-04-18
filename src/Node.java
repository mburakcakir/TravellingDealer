public class Node {

    Node following = null;

    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToEnd(int data) {
        Node end = new Node(data);
        Node n = this;

        while (n.following != null) {
            n = n.following;
        }
        n.following = end;
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    public void printNodes() {
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    int length(Node h) {
        return 0;
    }

    // TODO:: Implement to return the sum of the Nodes
    int sumOfNodes() {
        return 0;
    }

    Node deleteNode(Node head, int data) {
        Node n = head;
        if (n.data == data) {
            return head.following;
        }
        // TODO:: Implement the proper loop in order to remove given data

        //
        return head;
    }
}
/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        Node temp = head;
        int count = 0;

        // Count nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Find middle position
        int middle = count / 2;

        Node temp2 = head;

        // Move to middle node
        for (int i = 0; i < middle; i++) {
            temp2 = temp2.next;
        }

        return temp2.data;
    }
}
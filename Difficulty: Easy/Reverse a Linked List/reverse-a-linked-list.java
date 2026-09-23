/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
    Node prev=null;
    Node curr=head;
    
         while(curr!=null){
            Node forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
             
         }
         return prev;
    }
}
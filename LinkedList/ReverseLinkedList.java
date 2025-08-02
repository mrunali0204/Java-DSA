package LinkedList;

public class ReverseLinkedList {
    int Node;
    int prevNode;
    int nextNode;
    
    public void reverseIterate(){
        Node prevNode = head;
        Node currNode = head.next();
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
            
        }
    }
    
}

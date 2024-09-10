import java.security.cert.CRLReason;

class linkedList {
     Node head;
    private int size;

    linkedList() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next == null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printlist() {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty list,nothing to delete");
            return;
        }
        head = this.head.next;
        size--;

    }

    public void removeLast(){
        if(head == null) {
            System.out.println("Empty list,nothing to delete");
            return;
    }
    size--;
    if(head.next == null) {
        head = null;
        return;

    }
    Node currNode = head;
    Node lastNode = head.next;
    while(lastNode.next != null) {
        currNode = currNode.next;
        lastNode = lastNode.next;
    }
    currNode.next = null;
 }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printlist();

        list.addFirst("this");
        list.printlist();
        System.out.println(list.getSize());
        System.out.println(list);
        list.printlist();
        // list.removeLast();
        list.printlist();

    }
    public void addInMiddle(int Index, String data) {
        if(Index > size || Index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if(head == null || Index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }Node currNode = head;
        for(int i=1; i<size; i++) {
            if(i == Index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;

            }
            currNode = currNode.next;
        }

    } 

}
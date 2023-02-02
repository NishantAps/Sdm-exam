public class SinglyLinkedList {


  Node head; //represents the head of the linked list
  Node tail;// represents the tail of the linked list

  //Below class represents the node of the linked list
  class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addElement(int data) {
    //below line creates the new node
    Node newNode = new Node(data);

    /*now check head for null
    or linked list for empty*/
    if (head == null) {
      /*since linked list is empty head
       and tail points to same node*/
      head = newNode;
      tail = newNode;
    } else {
      //new node will be added after tail
      // so tail next points to newNode
      tail.next = newNode;

      //now newNode becomes the new tail
      tail = newNode;
    }
  }

  public void displayElement() {
    // node currentNode points the head
    Node currentNode = head;
    if (head == null) {
      System.out.println("Linked list is empty: There are no elements");
      return;
    }
    System.out.println("Linked List elements are: ");
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
  }

  public static void main(String[] args) {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    singlyLinkedList.addElement(9);
    singlyLinkedList.addElement(2);
    singlyLinkedList.addElement(6);
    singlyLinkedList.displayElement();

  }
}
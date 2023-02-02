Write the linked list code and make sure it contains 4 nodes.                                                                               class Node {
 class Node{
	 int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  Node head;

  public void insert(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  public void display() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    System.out.println("Linked List: ");
    list.display();
  }
}
}
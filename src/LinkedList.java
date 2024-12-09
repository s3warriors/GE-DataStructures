class LinkedList<T> {
    private Node<T> head; // Head (start) of the linked list

    // Add a node to the end of the linked list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) { // If the list is empty
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) { // Traverse to the last node
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        Node<T> current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Remove a node from the linked list by value
    public void remove(T data) {
        if (head == null) {
            System.out.println("The linked list is empty. Nothing to remove.");
            return;
        }

        if (head.data.equals(data)) { // If the node to remove is the head
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Node with value " + data + " not found.");
        } else {
            current.next = current.next.next;
        }
    }
}
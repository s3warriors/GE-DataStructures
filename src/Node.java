class Node<T> {
    T data;          // Data stored in the node (generic type)
    Node<T> next;    // Pointer to the next node

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
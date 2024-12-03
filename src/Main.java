
public class Main {
    public static void main(String[] args) {
        // Stack object initialization
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        // Removing elements
        s1.pop();
        // viewing stack's top
        s1.peek();

        // queue declaration
        Queue<Integer> q1 = new Queue<>();
        q1.queue(1);
        q1.queue(2);
        q1.queue(3);
        q1.queue(4);
        q1.queue(5);
        q1.queue(6);
        q1.queue(7);
        q1.queue(8);
        q1.queue(9);
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.curr();
    }
}

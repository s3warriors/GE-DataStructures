public class Stack <K>{
    // Type casting
    int n = 5;
    // Type casting for object of type  K
    K[] ar1 = (K[]) new Object[9];
    int top = -1;

    public void push(K k){
        // if array is empty
        if(top + 1 > ar1.length - 1){
            System.out.println("Stack is full");
        }
        else {
            // pre increment is used (++varName)
            ar1[++top] = k;
        }
    }

    public void pop(){
        // if stack is empty
        if(top == -1){
            System.out.println("Stack is Empty");
        } else {
            System.out.println(ar1[top]);
            top--;
        }
    }

    // peek() to see the top of Stack
    public void peek(){
        System.out.println(ar1[top]);
    }
}
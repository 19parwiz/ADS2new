public class MyLinkedList<T> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void add(T item) {
        // Implement add method
    }

    @Override
    public void set(int index, T item) {
        // Implement set method
    }

    // Implement other methods as per MyList interface

    // Test methods
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        // Test your methods here
    }
}

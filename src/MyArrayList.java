public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[10]; // Initial capacity
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
        MyArrayList<Integer> myList = new MyArrayList<>();
        // Test your methods here
    }
}

class LinkedStack<T> {
    private class Node<T> {
        T data;
        Node<T> next;

        public Node() {
            data = null;
            next = null;
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        boolean isEnd() {
            return (data == null && next == null);
        }
    }
    Node<T> top = new Node<>();

    public void push(T t) {
        top = new Node<>(t, top);
    }

    public T pop() {
        T result = top.data;
        if (!top.isEnd()) {
            top = top.next;
        }
        return result;
    }
}

public class _5 {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();
        for (int i = 0; i < 10; ++i) {
            stack.push(i * i);
        }
        Integer i;
        while ((i = stack.pop()) != null) {
            System.out.println(i);
        }
    }
}

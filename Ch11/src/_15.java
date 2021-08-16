import java.util.LinkedList;
import java.util.ListIterator;

class MyStack<T> {
    LinkedList<T> store = new LinkedList<>();

    public void push(T t) {
        store.addFirst(t);
    }

    public boolean empty() {
        return store.isEmpty();
    }

    @Override
    public String toString() {
        return store.toString();
    }

    public T pop() {
        return store.pop();
    }

    public T peek() {
        return store.getFirst();
    }
}

public class _15 {

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        String str = "+U+u+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '+') {
                myStack.push(String.valueOf(str.charAt(i + 1)));
                i++;
            }
            else {
                System.out.println(myStack.pop());
            }
        }

    }
}

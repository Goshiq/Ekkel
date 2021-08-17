import java.util.LinkedList;
import java.util.Queue;

class Command {
    String string;

    public void operation() {
        System.out.println(string);
    }

    public Command(String string) {
        this.string = string;
    }
}

class QueueStore {
    Queue<Command> store = new LinkedList<>();

    public Queue<Command> add(Command obj) {
        store.add(obj);
        return store;
    }
}

class IterQueue {
    static public void iterQueue(Queue<Command> queue) {
        for (Command q: queue) {
            q.operation();
        }
    }
}

public class _27 {
    public static void main(String[] args) {
        QueueStore store = new QueueStore();
        store.add(new Command("Uno"));
        store.add(new Command("Duo"));
        store.add(new Command("Trio"));
        IterQueue.iterQueue(store.store);
    }
}

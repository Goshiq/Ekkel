import java.util.PriorityQueue;
import java.util.Random;

public class _28 {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; ++i) {
            queue.offer(random.nextDouble());
        }
        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private AtomicInteger count = new AtomicInteger();

    void increment() {
        count.incrementAndGet();

    }

    int get() {
        return count.get();

    }
}

package Labs_3;

import java.util.PriorityQueue;

public class OrderProcessor {
    PriorityQueue<Order> pq;

    public OrderProcessor() {
        pq = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        pq.offer(order);
    }

    public Order processOrder() {
        return pq.poll();
    }
}

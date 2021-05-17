package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("William"));
        System.out.println(tq.offer("William"));
        System.out.println(tq.offer("William", 10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        if(tq.hasWaitingConsumer()) {
            tq.transfer("DevDojo");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}

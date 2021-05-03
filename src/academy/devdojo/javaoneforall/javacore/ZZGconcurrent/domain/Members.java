package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        lock.lock();
        try {
            while (this.emails.size() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " no emails found to be sent, waiting for instructions...");
                condition.await();
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void addMemberEmail(String email) {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " just added an email to the list");
            this.emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notifying all thread that emails are closed");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

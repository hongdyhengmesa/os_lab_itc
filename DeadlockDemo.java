public class DeadlockDemo {

    public static void main(String[] args) {
        Account account1 = new Account(1000);
        Account account2 = new Account(1000);

        Thread t1 = new Thread(() -> {
            TransferService.transfer(account1, account2, 100);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            TransferService.transfer(account2, account1, 200);
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}

public class DeadlockPreventionDemo {

    public static void main(String[] args) {

        Account account6004 = new Account(6004, 1000);
        Account account6005 = new Account(6005, 1000);

        Thread t1 = new Thread(() -> {
            TransferService.transfer(account6005, account6004, 50);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            TransferService.transfer(account6004, account6005, 50);
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}

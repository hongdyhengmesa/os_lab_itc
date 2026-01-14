class TransferService {

    public static void transfer(Account from, Account to, int amount) {
        synchronized (from) {   // lock first account
            System.out.println(Thread.currentThread().getName() + " locked FROM account");

            try {
                Thread.sleep(100); // simulate delay
            } catch (InterruptedException e) {}

            synchronized (to) { // lock second account
                System.out.println(Thread.currentThread().getName() + " locked TO account");

                from.balance -= amount;
                to.balance += amount;
                System.out.println("Transfer completed");
            }
        }
    }
}

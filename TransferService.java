class TransferService {

    public static void transfer(Account acc1, Account acc2, int amount) {

        // Fixed ordering (same idea as min / max in slide)
        Account first = acc1.id < acc2.id ? acc1 : acc2;
        Account second = acc1.id < acc2.id ? acc2 : acc1;

        synchronized (first) {
            System.out.println(Thread.currentThread().getName() +
                    " locked account " + first.id);

            synchronized (second) {
                System.out.println(Thread.currentThread().getName() +
                        " locked account " + second.id);

                // Critical section
                acc1.balance -= amount;
                acc2.balance += amount;

                System.out.println(Thread.currentThread().getName() +
                        " transferred " + amount);
            }
        }
    }
}

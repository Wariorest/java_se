package treds;

public class StartThreadCode {
    public static void Run (){
        final Bank bank = new Bank(2);

        Thread1 thread1 = new Thread1(bank);
        Thread2 thread2 = new Thread2(bank);

        thread1.start();
        thread2.start();

    }
}

import java.util.concurrent.locks.ReentrantLock;

public class ThreadsExample implements Runnable {
    static int compteur = 1;

    static ReentrantLock Lockcompteur = new ReentrantLock(true);

    static void incrementCounter(){
        Lockcompteur.lock();

        try{
            System.out.println(Thread.currentThread().getName() + ": " + compteur);
            if (compteur < 100){
                compteur++;
            }
        }finally{
            Lockcompteur.unlock();
        }
    }

    @Override
    public void run() {
        while(compteur<100){
            incrementCounter();
        }
    }

    public static void main(String[] args) {
        ThreadsExample te = new ThreadsExample();
        Thread thread1 = new Thread(te);
        Thread thread2 = new Thread(te);
        Thread thread3 = new Thread(te);
        Thread thread4 = new Thread(te);
        Thread thread5 = new Thread(te);
        Thread thread6 = new Thread(te);
        Thread thread7 = new Thread(te);
        Thread thread8 = new Thread(te);
        Thread thread9 = new Thread(te);
        Thread thread10 = new Thread(te);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
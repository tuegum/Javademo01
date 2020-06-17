package day_01.demo_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开启了一个新线程！");
            }
        });
    }
}

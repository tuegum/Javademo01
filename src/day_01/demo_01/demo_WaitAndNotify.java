package day_01.demo_01;

public class demo_WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("告知老板包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("开吃！");
                        System.out.println("===========================");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("5秒之后包子做好了");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}

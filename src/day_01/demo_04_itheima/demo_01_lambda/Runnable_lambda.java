package day_01.demo_04_itheima.demo_01_lambda;

public class Runnable_lambda {
    public static void satrt_thread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        satrt_thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ">> " + "启动了！");
            }
        });

        satrt_thread(()-> System.out.println(Thread.currentThread().getName()+ ">> " + "也启动了！"));
    }
}

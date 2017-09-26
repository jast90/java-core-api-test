package java.util;

public class TimerTest {

    public static void main(String[] args) {
        Timer timer = new Timer();
        Timer timer1 = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(String.format("%s %s:Hello", new Date(System.currentTimeMillis()), Thread.currentThread().getName()));
            }
        };
        TimerTask task1 = new TimerTask() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(String.format("%s %s:Hello", new Date(System.currentTimeMillis()), Thread.currentThread().getName()));
            }
        };
        timer.schedule(task, 0, 1000);//启动后立即执行每秒打印Hello
        timer1.schedule(task1, 0, 1000);//如果任务执行时间超过周期时间则会按周期时间执行
        //在延迟后执行
        //再延迟后周期性执行
        //在指定的时间执行
        //在指定的时间周期性执行
        //TODO fixedRate方法理解
    }
}

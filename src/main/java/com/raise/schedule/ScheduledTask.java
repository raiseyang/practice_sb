package com.raise.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * 定时调度任务
 * 作为统计,爬虫等用途
 */
@Component
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Integer count0 = 1;
    private Integer count1 = 1;
    private Integer count2 = 1;

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() throws InterruptedException {
//        System.out.println(String.format("---第%s次执行，当前时间为：%s", count0++, dateFormat.format(new Date())));
    }

    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTimeAfterSleep() throws InterruptedException {
//        System.out.println(String.format("===第%s次执行，当前时间为：%s", count1++, dateFormat.format(new Date())));
        start_python();
    }

    //http://blog.csdn.net/evilcry2012/article/details/51979205
    @Scheduled(cron = "0 0 1 * * *")
    public void reportCurrentTimeCron() throws InterruptedException {
//        System.out.println(String.format("+++第%s次执行，当前时间为：%s", count2++, dateFormat.format(new Date())));
    }

    private void start_python() {
//        PythonInterpreter interpreter = new PythonInterpreter();
//        System.out.println("--python start.");
//        interpreter.execfile("E:/workspace-raise/python-workspace/practice_python3/test/test.py");
//        System.out.println("--python end");

//        try {
//            Runtime.getRuntime().exec("python E:/workspace-raise/python-workspace/practice_python3/test/test.py");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

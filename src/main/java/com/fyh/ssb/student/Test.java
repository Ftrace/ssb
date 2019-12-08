package com.fyh.ssb.student;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
          // 创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 10, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(100));
          // execute 使用
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Java.");
            }
        });
        // submit 使用
        Future<String> future = threadPoolExecutor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Hello, 老王.");
                return "Success";
            }
        });
        System.out.println(future.get());
    }
}

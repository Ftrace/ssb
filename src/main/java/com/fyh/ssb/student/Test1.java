package com.fyh.ssb.student;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();

        // 存值
        threadLocal.set(Arrays.asList("小明", "Java "));

        // 取值
        List list = (List) threadLocal.get();
        System.out.println(list.size());
        System.out.println(threadLocal.get());

        //删除值
        threadLocal.remove();
        System.out.println(threadLocal.get());
    }
}

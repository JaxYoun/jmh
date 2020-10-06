package com.yang.jmh.rest;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * @author: Yang
 * @date: 2020/10/6 14:11
 * @description: 基准测试入口类
 */
public class JmhRest {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include("ForEachTest")
                .exclude("Pref")
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(2)
                .build();
        new Runner(opt).run();
    }

}

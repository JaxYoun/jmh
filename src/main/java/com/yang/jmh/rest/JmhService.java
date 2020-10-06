package com.yang.jmh.rest;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author: Yang
 * @date: 2020/10/6 14:11
 * @description:
 */
public class JmhService {

    private static final float kk = 123.456789F;

    @Benchmark
    @BenchmarkMode(Mode.All)
    public static String stringFormat() {
        return String.format("%.2f", kk);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public static String decimalFormat() {
        DecimalFormat format = new DecimalFormat("#.00");
        return format.format(kk);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public static BigDecimal bigDecimal() {
        BigDecimal bigDecimal = new BigDecimal(kk);
        bigDecimal.setScale(2, RoundingMode.UP);
        return bigDecimal;
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public static String numberFormat() {
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(2);
        format.setRoundingMode(RoundingMode.UP);
        return format.format(kk);
    }

    public static void main(String[] args) {
        System.out.println(stringFormat());
        System.out.println(decimalFormat());
        System.out.println(bigDecimal().toString());
        System.out.println(numberFormat());
    }

}

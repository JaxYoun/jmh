package com.yang.jmh.rest;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

/**
 * @author: Yang
 * @date: 2020/10/6 15:33
 * @description:
 */
public class ForEachTest {

    private static final int kk = 1000_000;

    /**
     * 正序循环
     */
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void go() {
        for (int i = 0; i < kk; i++) {

        }
    }

    /**
     * 逆序循环
     */
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void gu() {
        for (int i = kk; i > 0; i--) {

        }
    }

}
/**
 * 这是一个for循环的正/逆序对比测试，结果显式正序更快
 * D:\ProgramFiles\Java\jdk1.8.0_221\bin\java.exe "-javaagent:D:\ProgramFiles\JetBrains\IntelliJIDEA2018.2.1\IntelliJ IDEA 2018.2.1\lib\idea_rt.jar=52273:D:\ProgramFiles\JetBrains\IntelliJIDEA2018.2.1\IntelliJ IDEA 2018.2.1\bin" -Dfile.encoding=UTF-8 -classpath D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\charsets.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\deploy.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\access-bridge-64.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\cldrdata.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\dnsns.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\jaccess.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\jfxrt.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\localedata.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\nashorn.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\sunec.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\sunjce_provider.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\sunmscapi.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\sunpkcs11.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\ext\zipfs.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\javaws.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\jce.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\jfr.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\jfxswt.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\jsse.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\management-agent.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\plugin.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\resources.jar;D:\ProgramFiles\Java\jdk1.8.0_221\jre\lib\rt.jar;F:\sourceCode\jmh\target\classes;E:\appData\mavenRepo\org\springframework\boot\spring-boot-starter-web\2.3.4.RELEASE\spring-boot-starter-web-2.3.4.RELEASE.jar;E:\appData\mavenRepo\org\springframework\boot\spring-boot-starter\2.3.4.RELEASE\spring-boot-starter-2.3.4.RELEASE.jar;E:\appData\mavenRepo\org\springframework\boot\spring-boot\2.3.4.RELEASE\spring-boot-2.3.4.RELEASE.jar;E:\appData\mavenRepo\org\springframework\boot\spring-boot-autoconfigure\2.3.4.RELEASE\spring-boot-autoconfigure-2.3.4.RELEASE.jar;E:\appData\mavenRepo\org\springframework\boot\spring-boot-starter-logging\2.3.4.RELEASE\spring-boot-starter-logging-2.3.4.RELEASE.jar;E:\appData\mavenRepo\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;E:\appData\mavenRepo\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;E:\appData\mavenRepo\org\apache\logging\log4j\log4j-to-slf4j\2.13.3\log4j-to-slf4j-2.13.3.jar;E:\appData\mavenRepo\org\apache\logging\log4j\log4j-api\2.13.3\log4j-api-2.13.3.jar;E:\appData\mavenRepo\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;E:\appData\mavenRepo\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;E:\appData\mavenRepo\org\yaml\snakeyaml\1.26\snakeyaml-1.26.jar;E:\appData\mavenRepo\org\springframework\boot\spring-boot-starter-json\2.3.4.RELEASE\spring-boot-starter-json-2.3.4.RELEASE.jar;E:\appData\mavenRepo\com\fasterxml\jackson\core\jackson-databind\2.11.2\jackson-databind-2.11.2.jar;E:\appData\mavenRepo\com\fasterxml\jackson\core\jackson-annotations\2.11.2\jackson-annotations-2.11.2.jar;E:\appData\mavenRepo\com\fasterxml\jackson\core\jackson-core\2.11.2\jackson-core-2.11.2.jar;E:\appData\mavenRepo\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.11.2\jackson-datatype-jdk8-2.11.2.jar;E:\appData\mavenRepo\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.11.2\jackson-datatype-jsr310-2.11.2.jar;E:\appData\mavenRepo\com\fasterxml\jackson\module\jackson-module-parameter-names\2.11.2\jackson-module-parameter-names-2.11.2.jar;E:\appData\mavenRepo\org\springframework\boot\spring-boot-starter-tomcat\2.3.4.RELEASE\spring-boot-starter-tomcat-2.3.4.RELEASE.jar;E:\appData\mavenRepo\org\apache\tomcat\embed\tomcat-embed-core\9.0.38\tomcat-embed-core-9.0.38.jar;E:\appData\mavenRepo\org\glassfish\jakarta.el\3.0.3\jakarta.el-3.0.3.jar;E:\appData\mavenRepo\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.38\tomcat-embed-websocket-9.0.38.jar;E:\appData\mavenRepo\org\springframework\spring-web\5.2.9.RELEASE\spring-web-5.2.9.RELEASE.jar;E:\appData\mavenRepo\org\springframework\spring-beans\5.2.9.RELEASE\spring-beans-5.2.9.RELEASE.jar;E:\appData\mavenRepo\org\springframework\spring-webmvc\5.2.9.RELEASE\spring-webmvc-5.2.9.RELEASE.jar;E:\appData\mavenRepo\org\springframework\spring-aop\5.2.9.RELEASE\spring-aop-5.2.9.RELEASE.jar;E:\appData\mavenRepo\org\springframework\spring-context\5.2.9.RELEASE\spring-context-5.2.9.RELEASE.jar;E:\appData\mavenRepo\org\springframework\spring-expression\5.2.9.RELEASE\spring-expression-5.2.9.RELEASE.jar;E:\appData\mavenRepo\org\openjdk\jmh\jmh-core\1.25.2\jmh-core-1.25.2.jar;E:\appData\mavenRepo\net\sf\jopt-simple\jopt-simple\4.6\jopt-simple-4.6.jar;E:\appData\mavenRepo\org\apache\commons\commons-math3\3.2\commons-math3-3.2.jar;E:\appData\mavenRepo\org\projectlombok\lombok\1.18.12\lombok-1.18.12.jar;E:\appData\mavenRepo\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;E:\appData\mavenRepo\org\springframework\spring-core\5.2.9.RELEASE\spring-core-5.2.9.RELEASE.jar;E:\appData\mavenRepo\org\springframework\spring-jcl\5.2.9.RELEASE\spring-jcl-5.2.9.RELEASE.jar com.yang.jmh.rest.JmhRest
 * # JMH version: 1.25.2
 * # VM version: JDK 1.8.0_221, Java HotSpot(TM) 64-Bit Server VM, 25.221-b11
 * # VM invoker: D:\ProgramFiles\Java\jdk1.8.0_221\jre\bin\java.exe
 * # VM options: -javaagent:D:\ProgramFiles\JetBrains\IntelliJIDEA2018.2.1\IntelliJ IDEA 2018.2.1\lib\idea_rt.jar=52273:D:\ProgramFiles\JetBrains\IntelliJIDEA2018.2.1\IntelliJ IDEA 2018.2.1\bin -Dfile.encoding=UTF-8
 * # Warmup: 5 iterations, 10 s each
 * # Measurement: 5 iterations, 10 s each
 * # Timeout: 10 min per iteration
 * # Threads: 1 thread, will synchronize iterations
 * # Benchmark mode: Throughput, ops/time
 * # Benchmark: com.yang.jmh.rest.ForEachTest.go
 * <p>
 * # Run progress: 0.00% complete, ETA 00:06:40
 * # Fork: 1 of 2
 * # Warmup Iteration   1: 1359887932.744 ops/s
 * # Warmup Iteration   2: 1269636347.937 ops/s
 * # Warmup Iteration   3: 1261837669.853 ops/s
 * # Warmup Iteration   4: 1263588210.595 ops/s
 * # Warmup Iteration   5: 1263549310.957 ops/s
 * Iteration   1: 1251493393.517 ops/s
 * Iteration   2: 1253406351.056 ops/s
 * Iteration   3: 1272276094.945 ops/s
 * Iteration   4: 1268282495.529 ops/s
 * Iteration   5: 1258502926.761 ops/s
 * <p>
 * # Run progress: 25.00% complete, ETA 00:05:04
 * # Fork: 2 of 2
 * # Warmup Iteration   1: 1259094690.416 ops/s
 * # Warmup Iteration   2: 1258658400.857 ops/s
 * # Warmup Iteration   3: 1260041545.926 ops/s
 * # Warmup Iteration   4: 1266699707.362 ops/s
 * # Warmup Iteration   5: 1267324047.342 ops/s
 * Iteration   1: 1259268979.716 ops/s
 * Iteration   2: 1248443811.900 ops/s
 * Iteration   3: 1251886713.262 ops/s
 * Iteration   4: 1239100374.161 ops/s
 * Iteration   5: 1247283788.925 ops/s
 * <p>
 * <p>
 * Result "com.yang.jmh.rest.ForEachTest.go":
 * 1254994492.977 ±(99.9%) 14994026.465 ops/s [Average]
 * (min, avg, max) = (1239100374.161, 1254994492.977, 1272276094.945), stdev = 9917620.135
 * CI (99.9%): [1240000466.512, 1269988519.442] (assumes normal distribution)
 * <p>
 * <p>
 * # JMH version: 1.25.2
 * # VM version: JDK 1.8.0_221, Java HotSpot(TM) 64-Bit Server VM, 25.221-b11
 * # VM invoker: D:\ProgramFiles\Java\jdk1.8.0_221\jre\bin\java.exe
 * # VM options: -javaagent:D:\ProgramFiles\JetBrains\IntelliJIDEA2018.2.1\IntelliJ IDEA 2018.2.1\lib\idea_rt.jar=52273:D:\ProgramFiles\JetBrains\IntelliJIDEA2018.2.1\IntelliJ IDEA 2018.2.1\bin -Dfile.encoding=UTF-8
 * # Warmup: 5 iterations, 10 s each
 * # Measurement: 5 iterations, 10 s each
 * # Timeout: 10 min per iteration
 * # Threads: 1 thread, will synchronize iterations
 * # Benchmark mode: Throughput, ops/time
 * # Benchmark: com.yang.jmh.rest.ForEachTest.gu
 * <p>
 * # Run progress: 50.00% complete, ETA 00:03:23
 * # Fork: 1 of 2
 * # Warmup Iteration   1: 1246375005.958 ops/s
 * # Warmup Iteration   2: 1270256057.884 ops/s
 * # Warmup Iteration   3: 1262647742.681 ops/s
 * # Warmup Iteration   4: 1266269249.932 ops/s
 * # Warmup Iteration   5: 1260137028.873 ops/s
 * Iteration   1: 1255367717.716 ops/s
 * Iteration   2: 1270942267.179 ops/s
 * Iteration   3: 1260521262.740 ops/s
 * Iteration   4: 1256555061.121 ops/s
 * Iteration   5: 1202405452.358 ops/s
 * <p>
 * # Run progress: 75.00% complete, ETA 00:01:41
 * # Fork: 2 of 2
 * # Warmup Iteration   1: 1077640501.484 ops/s
 * # Warmup Iteration   2: 1105513605.813 ops/s
 * # Warmup Iteration   3: 1123923829.152 ops/s
 * # Warmup Iteration   4: 1115897362.062 ops/s
 * # Warmup Iteration   5: 1123623247.140 ops/s
 * Iteration   1: 1130734253.889 ops/s
 * Iteration   2: 1130173606.191 ops/s
 * Iteration   3: 1240698532.599 ops/s
 * Iteration   4: 1251263667.702 ops/s
 * Iteration   5: 1255516535.639 ops/s
 * <p>
 * <p>
 * Result "com.yang.jmh.rest.ForEachTest.gu":
 * 1225417835.713 ±(99.9%) 80545251.532 ops/s [Average]
 * (min, avg, max) = (1130173606.191, 1225417835.713, 1270942267.179), stdev = 53275696.841
 * CI (99.9%): [1144872584.181, 1305963087.245] (assumes normal distribution)
 * <p>
 * <p>
 * # Run complete. Total time: 00:06:46
 * <p>
 * REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
 * why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
 * experiments, perform baseline and negative tests that provide experimental control, make sure
 * the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
 * Do not assume the numbers tell you what you want them to tell.
 * <p>
 * Benchmark        Mode  Cnt           Score          Error  Units
 * ForEachTest.go  thrpt   10  1254994492.977 ± 14994026.465  ops/s
 * ForEachTest.gu  thrpt   10  1225417835.713 ± 80545251.532  ops/s
 * <p>
 * Process finished with exit code 0
 */

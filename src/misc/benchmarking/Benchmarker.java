package misc.benchmarking;

public class Benchmarker {

    public static long nanoTimer(Runnable task, int repeat) {
        long best = Long.MAX_VALUE;
        for (int i = 0; i < repeat; i++) {
            long start = System.nanoTime();
            task.run();
            long time = System.nanoTime() - start;
            best = Math.min(best, time);
        }
        return best / 1_000_000; // ms
    }

    public static void benchmark(Class clazz, String methodName, int repeat, Object matrix) {

       /* clazz.getMethod(methodName);

        // Warmup (important for JVM JIT)

        // Benchmark
        long loopTime = benchmark(() -> getRowSumLoop(matrix), repeat);
        long streamTime = benchmark(() -> getRowSumStream(matrix), repeat);
        long parallelTime = benchmark(() -> getRowSumParallel(matrix), repeat);

        System.out.println("Loop: " + loopTime + " ms");
        System.out.println("Stream: " + streamTime + " ms");
        System.out.println("Parallel: " + parallelTime + " ms");*/
    }
}

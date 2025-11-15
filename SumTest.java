public class SumTest {
    public static void main(String[] args) {

        // --- System Information ---
        System.out.println("=== Java System Information ===");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Operating System: " + System.getProperty("os.name") + " " + System.getProperty("os.version"));
        System.out.println("Architecture: " + System.getProperty("os.arch"));
        System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
        System.out.println("Total Memory: " + (Runtime.getRuntime().totalMemory() / (1024 * 1024)) + " MB");
        System.out.println("Max Memory: " + (Runtime.getRuntime().maxMemory() / (1024 * 1024)) + " MB");
        System.out.println();

        // --- Execution Test ---
        long startTime = System.nanoTime();

        long total = 0;
        for (int i = 0; i < 50_000_000; i++) {
            total += i;
        }

        long endTime = System.nanoTime();

        double seconds = (endTime - startTime) / 1_000_000_000.0;

        System.out.println("Java Result: " + total);
        System.out.println("Execution Time: " + seconds + " seconds");
    }
}


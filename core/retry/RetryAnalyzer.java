
package core.retry;

public class RetryAnalyzer {

    public static boolean retry(int attempt, int maxAttempts) {
        return attempt < maxAttempts;
    }
}

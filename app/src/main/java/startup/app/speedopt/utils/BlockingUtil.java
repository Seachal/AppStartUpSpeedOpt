package startup.app.speedopt.utils;

/**
 * Created by popfisher on 2016/11/22.
 */

public class BlockingUtil {

    /**
     * 模拟阻塞 , sca：阻塞当前线程， 应该是主线程。
     */
    public static void simulateBlocking(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 也可以用SystemClock来实现阻塞
        // SystemClock.sleep(200);
    }

}

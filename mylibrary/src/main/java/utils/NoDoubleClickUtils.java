package utils;

public class NoDoubleClickUtils {
    private static long lastClickTime;
    private static final int SPACE_TIME = 800;

    public NoDoubleClickUtils() {
    }

    public static void initLastClickTime() {
        lastClickTime = 0L;
    }

    public static synchronized boolean isDoubleClick() {
        long var0 = System.currentTimeMillis();
        boolean var2;
        if (var0 - lastClickTime > 800L) {
            var2 = false;
        } else {
            var2 = true;
        }

        lastClickTime = var0;
        return var2;
    }
}

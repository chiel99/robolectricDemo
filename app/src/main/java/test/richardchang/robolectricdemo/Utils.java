package test.richardchang.robolectricdemo;

import android.os.Build;

import java.util.UUID;

public final class Utils {

    public static boolean isAndroidSupported() {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            return true;
        }
        return false;
    }

    public static String generateNewUUId() {
        return UUID.randomUUID().toString();
    }
}

package test.richardchang.robolectricdemo;

import android.util.Log;

public class PowerMockSample {
    private static final String TAG = "PowerMockSample";

    private static final int STATE_NOT_READY = 0;
    private static final int STATE_READY = 1;

    private int mState = STATE_NOT_READY;

    public String printUUID() {
        String uuid = Utils.generateNewUUId();
        Log.d(TAG, "UUID = " + uuid);
        return uuid;
    }

    public boolean doSomethingIfStateReady() {
        if (mState == STATE_READY) {
            // DO some thing
            return true;
        } else {
            return false;
        }
    }

}

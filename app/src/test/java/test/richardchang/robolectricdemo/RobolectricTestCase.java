package test.richardchang.robolectricdemo;

import android.os.Build;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;

@Config(shadows = {ShadowLog.class}, manifest = Config.NONE, constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public abstract class RobolectricTestCase {

    @Before
    public void setup() {
        ShadowLog.stream = System.out;
    }
}

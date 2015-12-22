package test.richardchang.robolectricdemo;

import android.os.Build;

import org.junit.Test;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilsTest extends RobolectricTestCase {

    @Test
    @Config(sdk = Build.VERSION_CODES.JELLY_BEAN_MR2)
    public void testAndroid43() throws Exception {
        assertThat(Utils.isAndroidSupported()).isFalse();
    }

    @Test
    @Config(sdk = Build.VERSION_CODES.KITKAT)
    public void testAndroid44() throws Exception {
        assertThat(Utils.isAndroidSupported()).isTrue();
    }
}

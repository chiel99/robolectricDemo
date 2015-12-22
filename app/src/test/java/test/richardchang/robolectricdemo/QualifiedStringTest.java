package test.richardchang.robolectricdemo;

import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

public class QualifiedStringTest extends RobolectricTestCase {

    @Test
    @Config(qualifiers = "ja")
    public void testTextViewJapan() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        final TextView textView = (TextView) activity.findViewById(R.id.text);

        assertThat(textView.getText()).isEqualTo("こんにちは世界!");
    }

    @Test
    @Config(qualifiers = "zh")
    public void testTextViewTaiwan() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        final TextView textView = (TextView) activity.findViewById(R.id.text);

        assertThat(textView.getText()).isEqualTo("你好世界!");
    }
}

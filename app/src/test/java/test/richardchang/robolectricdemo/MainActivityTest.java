package test.richardchang.robolectricdemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;

import org.junit.Test;
import org.robolectric.Robolectric;

import static org.assertj.core.api.Assertions.assertThat;
import static org.robolectric.Shadows.shadowOf;

public class MainActivityTest extends RobolectricTestCase {

    @Test
    public void testLayout() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);

        final TextView textView = (TextView) activity.findViewById(R.id.text);
        final Button button = (Button) activity.findViewById(R.id.btn);

        assertThat(textView).isNotNull();
        assertThat(button).isNotNull();
    }

    @Test
    public void testTextViewColor() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        final TextView textView = (TextView) activity.findViewById(R.id.text);

        assertThat(textView.getCurrentTextColor()).isEqualTo(Color.WHITE);
    }

    @Test
    public void testButtonClick() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        final Button button = (Button) activity.findViewById(R.id.btn);

        button.performClick();

        Uri uri = Uri.parse("http://www.vmfive.com");
        assertThat(shadowOf(activity).getNextStartedActivity().getData()).isEqualTo(uri);
    }
}

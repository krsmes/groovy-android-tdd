package com.wtsdaregion22.testing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;

import android.widget.Button;
import android.widget.TextView;

import com.wtsdaregion22.testing.DroidActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import dalvik.annotation.TestTargetClass;

@RunWith(RobolectricTestRunner.class)
@Config(manifest="./src/main/AndroidManifest.xml", emulateSdk = 21)
public class DroidActivityTest {

    @Test
    public void shouldHaveAHelloGroovyString() throws Exception {
        String hello = new DroidActivity().getResources().getString(R.string.hello_world);
        assertThat(hello, equalTo("Hello world!"));
    }

    @Test
    public void shouldCheckTextViewHasCorrectText() throws Exception {
        String expected = "Hello Groovy! Is this thing on?";
        DroidActivity myActivity = Robolectric.buildActivity(DroidActivity.class).create().get();

        TextView actualView = (TextView) myActivity.findViewById(R.id.message);

        String actual = actualView.getText().toString();
        assertThat(expected, equalTo(actual));
    }

    @Test
    public void shouldHaveAHiddenRevertButton() throws Exception {
        DroidActivity myActivity = Robolectric.buildActivity(DroidActivity.class).create().get();

        Button actualButton = (Button) myActivity.findViewById(R.id.revert_button);

        assertFalse(actualButton.getVisibility() == android.view.View.VISIBLE);

    }
}
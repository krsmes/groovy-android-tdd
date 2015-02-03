package com.wtsdaregion22.testing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = 21)
public class DroidActivityTest {

    @Test
    public void shouldHaveAHelloGroovyString() throws Exception {
        String hello = new DroidActivity().getResources().getString(R.string.hello_world);
        assertThat(hello, equalTo("Hello world!"));
    }

    @Test
    public void shouldCheckTextViewHasCorrectText() throws Exception {
        String expected = "Hello world.. now with Groovy!";
        DroidActivity myActivity = new DroidActivity();

        TextView actualView = (TextView) myActivity.findViewById(R.id.message);

        String actual = actualView.getText().toString();
        assertThat(expected, equalTo(actual));
    }
}
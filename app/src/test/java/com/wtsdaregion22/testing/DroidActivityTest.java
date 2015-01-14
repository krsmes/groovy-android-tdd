package com.wtsdaregion22.testing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class DroidActivityTest {

    @Test
    public void shouldHaveAHelloGroovyString() throws Exception {
        String hello = new DroidActivity().getResources().getString(R.string.hello_world);
        assertThat(hello, equalTo("Hello world!"));
    }
}
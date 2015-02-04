package com.wtsdaregion22.testing

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.suitebuilder.annotation.LargeTest
import android.test.ActivityInstrumentationTestCase2

@LargeTest
public class HelloGroovyWorldEspressoTest extends ActivityInstrumentationTestCase2<DroidActivity> {

    public HelloGroovyWorldEspressoTest() {
        super(DroidActivity.class)
    }

    @Override
    public void setUp() throws Exception {
        super.setUp()
        getActivity()
    }

    public void testListGoesOverTheFold() {
        Espresso.onView(ViewMatchers.withText("Hello Groovy! Is this thing on?")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}
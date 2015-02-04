package com.wtsdaregion22.testing

import android.support.test.espresso.Espresso
import android.support.test.espresso.ViewAction
import android.support.test.espresso.action.ViewActions;
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

    public void testButtonClickChangesTest() {
        Espresso.onView(ViewMatchers.withId(R.id.button_spiffy)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.message)).check(ViewAssertions.matches(ViewMatchers.withText("SpiffyButton is spiffy!")))
    }
}
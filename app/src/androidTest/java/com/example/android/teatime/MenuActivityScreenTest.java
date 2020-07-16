package com.example.android.teatime;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;

/**
 * @author ravi
 * Test the Menu activity screen
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MenuActivityScreenTest {

@Rule public ActivityTestRule<MenuActivity> menuActivityActivityTestRule = new ActivityTestRule<>(MenuActivity.class);

@Test
public void teaPositionClick(){

    // check list view is visible
    onView(withId(R.id.tea_grid_view)).check(matches(isDisplayed()));
   // onData(allOf(is(instanceOf(String.class)), startsWith("Green Tea"))).perform(click());
   // onData(allOf(is(instanceOf(String.class)), startsWith("Green Tea")))
     //       .check(matches(withText("Green Tea")));

    // click a child item
    onData(allOf())
            .inAdapterView(withId(R.id.tea_grid_view))
            .atPosition(1)
            .perform(click());

}



}
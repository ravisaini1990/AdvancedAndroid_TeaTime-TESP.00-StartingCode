/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.teatime;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * This is an example instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class OrderActivityBasicTest {

    // To launch the mentioned activity under testing
    @Rule
    public ActivityTestRule<OrderActivity> mActivityRule = new ActivityTestRule<>(OrderActivity.class);

    @Test
    public void testHintVisibility(){
       //find the view & perform
        onView(withId(R.id.increment_button)).perform(click());

        //check
        onView(withId(R.id.quantity_text_view)).check(matches(withText("1")));
        onView(withId(R.id.cost_text_view)).check(matches(withText("$5.00")));

        // check hint visibility
        //onView(withId(R.id.editTextName)).check(matches(withHint("Enter Name")));

        // enter name
        //onView(withId(R.id.editTextName)).perform(typeText("Pavneet"),closeSoftKeyboard());
        //onView(withId(R.id.editTextName)).check(matches(withText("Pavneet")));
    }

}
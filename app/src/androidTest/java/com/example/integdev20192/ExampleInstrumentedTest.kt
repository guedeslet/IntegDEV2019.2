package com.example.integdev20192

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    var mainActivityRule = IntentsTestRule(MainActivity::class.java, false , true )
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.integdev20192", appContext.packageName)
    }
    @Test
    fun whenActivityIsLaunched_shouldDisplayInitialState(){
        onView(withId(R.id.button)).check(matches(isDisplayed()))
        onView(withId(R.id.textView)).check(matches(isDisplayed()))
        onView(withId(R.id.button)).check(matches(isClickable()))
        onView(withId(R.id.button)).perform(click())
    }

}

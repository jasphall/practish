package pl.practish

import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId

class Events {

    fun clickOnView(@IdRes viewId: Int) {
        onView(withId(viewId)).perform(click())
    }

    fun enterText(@IdRes viewId: Int, text: String) {
        onView(withId(viewId))
            .perform(typeText(text))
            .perform(closeSoftKeyboard())
    }

}
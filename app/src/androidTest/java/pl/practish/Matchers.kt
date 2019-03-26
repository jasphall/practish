package pl.practish

import android.app.Activity
import androidx.annotation.IdRes
import androidx.annotation.StringRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

class Matchers {

    fun<T: Activity> nextOpenActivityIs(clazz: Class<T>) {
        intended(hasComponent(clazz.name))
    }

    fun viewContainsText(@IdRes viewId: Int, @StringRes stringResource: String) {
        onView(withId(viewId))
            .check(matches(withText(stringResource)))
    }

}
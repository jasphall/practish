package pl.practish

import org.junit.Assert.assertTrue
import org.junit.Test

class SearchActivityTest: AcceptanceTest<SearchActivity>(SearchActivity::class.java) {

    @Test
    fun shouldOpenSearchResultsScreenOnOkClick () {
        // given
        events.enterText(R.id.search_text_box, "friends")

        // when
        events.clickOnView(R.id.button)

        // then
        checkThat.nextOpenActivityIs(SearchResultsActivity::class.java)
        checkThat.viewContainsText(R.id.search_phrase, "friends")
    }

    @Test
    fun shouldNotOpenSearchResultsScreenWhenSearchPhraseIsEmpty() {
        // given
        events.enterText(R.id.search_text_box, "")

        // when
        events.clickOnView(R.id.button)

        // then
        searchActivityIsStillVisible()
    }

    private fun searchActivityIsStillVisible() {
        assertTrue(getCurrentActivity().javaClass == SearchActivity::class.java)
    }

}
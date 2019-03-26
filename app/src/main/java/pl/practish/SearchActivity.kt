package pl.practish

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val textView = findViewById<TextView>(R.id.search_text_box)
        val okButton = findViewById<Button>(R.id.button)

        okButton.setOnClickListener {
            val searchPhrase = textView.text

            if (!searchPhrase.isNullOrEmpty()) {
                startSearchResultsActivity(searchPhrase.toString())
            }
        }
    }

    private fun startSearchResultsActivity(searchPhrase: String) {
        val searchResultsIntent = Intent(this, SearchResultsActivity::class.java)
        searchResultsIntent.putExtra("searchPhrase", searchPhrase)

        startActivity(searchResultsIntent)
    }

}

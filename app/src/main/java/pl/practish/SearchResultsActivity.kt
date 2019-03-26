package pl.practish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SearchResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_results)

        val searchPhrase = intent?.extras?.get("searchPhrase") as String
        findViewById<TextView>(R.id.search_phrase).text = searchPhrase
    }
}

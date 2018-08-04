package kotlinlistview.com.kotlinlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val values = arrayOf(
                "Test 1",
                "Test 2",
                "Test 3",
                "IT Crowd",
                "Person of Interest")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values)

        listView.adapter =adapter

    }
}

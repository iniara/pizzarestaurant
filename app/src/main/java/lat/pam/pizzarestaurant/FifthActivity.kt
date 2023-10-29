package lat.pam.pizzarestaurant

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class FifthActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        val layoutTY = findViewById<LinearLayout>(R.id.layoutTY)
        val doneButton = findViewById<Button>(R.id.doneButton)

        doneButton.setOnClickListener {
            layoutTY.visibility = View.VISIBLE
        }



    }
}
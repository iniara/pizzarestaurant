package lat.pam.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import lat.pam.pizzarestaurant.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val addButton = findViewById<FloatingActionButton>(R.id.fab)
        val extraName = intent.getStringExtra("EXTRA_NAME")
        val extraDistrict = intent.getStringExtra("EXTRA_DISTRICT")
        addButton.setOnClickListener {
           Intent(this, FourthActivity::class.java).also {
               it.putExtra("EXTRA_NAME", extraName)
               it.putExtra("EXTRA_DISTRICT", extraDistrict)
               startActivity(it)
           }
        }
    }
}

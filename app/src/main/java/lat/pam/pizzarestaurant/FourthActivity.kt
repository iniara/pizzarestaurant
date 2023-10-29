package lat.pam.pizzarestaurant

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val orderButton: Button = findViewById(R.id.orderButton)

        orderButton.setOnClickListener {
            val receivedData = intent.getStringExtra("data_key")
            val intent = Intent(this, FifthActivity::class.java)
            intent.putExtra("data_key", receivedData)
            startActivity(intent)
        }

        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            // Menangani klik tombol "Back" untuk kembali ke ThirdActivity
            onBackPressed()
        }
    }
}

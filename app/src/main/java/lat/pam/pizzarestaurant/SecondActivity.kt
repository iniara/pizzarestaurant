package lat.pam.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val menuButton: Button = findViewById(R.id.menuButton)

        menuButton.setOnClickListener {
            val receivedData = intent.getStringExtra("data_key")
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("data_key", receivedData)
            startActivity(intent)
        }
    }
}

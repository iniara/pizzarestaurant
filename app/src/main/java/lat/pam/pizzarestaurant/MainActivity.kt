package lat.pam.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val storeSpinner: Spinner = findViewById(R.id.storeSpinner)
        val stores = listOf("Cihampelas", "Cibiru")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, stores)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        storeSpinner.adapter = adapter

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val submitButton: Button = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val selectedStore = storeSpinner.selectedItem.toString()
            val customerName = nameEditText.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("data_key", "Data yang akan dikirim")
            intent.putExtra("selectedStore", selectedStore)
            intent.putExtra("customerName", customerName)
            startActivity(intent)
        }
    }
}

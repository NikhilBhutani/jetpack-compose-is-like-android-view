package de.check24.demo.features.password.numeric

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.check24.demo.R

class AndroidUINumericPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.password_numeric)
        supportActionBar?.title = "Password (Numeric)"
    }
}
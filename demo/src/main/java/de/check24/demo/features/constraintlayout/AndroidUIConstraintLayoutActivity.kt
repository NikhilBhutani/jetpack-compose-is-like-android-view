package de.check24.demo.features.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.check24.demo.R

class AndroidUIConstraintLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)
        supportActionBar?.title = "Constraint Layout"
    }
}
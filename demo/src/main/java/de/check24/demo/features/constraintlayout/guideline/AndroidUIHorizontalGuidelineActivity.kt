package de.check24.demo.features.constraintlayout.guideline

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.check24.demo.R

class AndroidUIHorizontalGuidelineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.guideline_horizontal)
        supportActionBar?.title = "Guideline Horizontal"
    }
}
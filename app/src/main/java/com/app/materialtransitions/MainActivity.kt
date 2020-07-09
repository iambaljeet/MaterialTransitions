package com.app.materialtransitions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityOptionsCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab_add.setOnClickListener {
            val intent = Intent(this, ComposeActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, fab_add, fab_add.transitionName
            )
            startActivity(intent, options.toBundle())
        }
    }
}
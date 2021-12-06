package com.pankajkcodes.lifecycleobserver

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())
        Log.d("MAIN", "MainActivity : onCreate")
        Toast.makeText(this, "MainActivity : onCreate", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "MainActivity : onPause")
        Toast.makeText(this, "MainActivity : onPause", Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "MainActivity : onResume")
        Toast.makeText(this, "MainActivity : onResume", Toast.LENGTH_LONG).show()

    }


    override fun onBackPressed() {
        super.onBackPressed()
        Log.d("MAIN", "MainActivity : onBackPressed")
        Toast.makeText(this, "MainActivity : onBackPressed", Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "MainActivity : onDestroy")
        Toast.makeText(this, "MainActivity : onDestroy", Toast.LENGTH_LONG).show()

    }

}
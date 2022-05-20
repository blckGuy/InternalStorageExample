package com.example.intents

import android.os.Bundle

class SecondActivity : : AppCompatActivity(){
    val Log = Logger.getLogger(SecondActivity::class.java.name)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.info("onCreate")
        btnExitActivity.setOnClickListener {
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.info("onStart")
    }
    override fun onStop() {
        super.onStop()
        Log.info("onStop")
    }

    }

package com.bagi.drawpath

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn?.viewTreeObserver?.addOnGlobalLayoutListener {
            btn?.let {
                pv?.init(it.width, it.height)
            }
        }

        Handler().postDelayed({ btn?.isEnabled = true },10 * 1000)
    }
}

package io.its3squares.appinutil.levels

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.its3squares.appinutil.R


class Level2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level2)
        (this as AppCompatActivity).supportActionBar!!.title = "ESSA É A FASE 2 MLK"

    }
}

package io.its3squares.appinutil

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count: Int = 0

        btnHereFake.setOnClickListener {
            lblHello.setTextColor(Color.rgb(Random.nextInt(255), Random.nextInt(255), Random.nextInt(255)))
            lblAd1.setTextColor(Color.rgb(Random.nextInt(255), Random.nextInt(255), Random.nextInt(255)))
            lblMusic1.setTextColor(Color.rgb( Random.nextInt(255), Random.nextInt(255), Random.nextInt(255)))
            lblWelcome.setTextColor(Color.rgb(Random.nextInt(255), Random.nextInt(255), Random.nextInt(255)))
            count++

            if (count >= 5){
                lblHello.setText("Se estiver com dificuldades, aumente o brilho. ://")
            }

        }

        lblAd1.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/its3squares"))
            startActivity(i)
        }

        lblMusic1.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/track/3CWuU5kIw8zsWJTcgreUwl"))
            startActivity(i)
        }
    }
}

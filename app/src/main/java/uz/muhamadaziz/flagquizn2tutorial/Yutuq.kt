package uz.muhamadaziz.flagquizn2tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_yutuq.*

class Yutuq : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yutuq)

        davom_etish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))

            xarita.image1 = 0
            xarita.name1 = ""

            xarita.image2 = 0
            xarita.name2 = ""

            xarita.image3 = 0
            xarita.name3 = ""

            xarita.image4 = 0
            xarita.name4 = ""

            xarita.image5 = 0
            xarita.name5 = ""

            xarita.image6 = 0
            xarita.name6 = ""

            xarita.image7 = 0
            xarita.name7 = ""

            xarita.image8 = 0
            xarita.name8 = ""

            xarita.image9 = 0
            xarita.name9 = ""

            xarita.image10 = 0
            xarita.name10 = ""

        }
    }
}
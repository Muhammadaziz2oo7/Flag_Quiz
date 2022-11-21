package uz.muhamadaziz.flagquizn2tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import uz.muhamadaziz.flagquizn2tutorial.R.drawable.*

class MainActivity : AppCompatActivity() {
    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        OsiyoDavlatlari.setOnClickListener {

            xarita.image1 = russia
            xarita.name1 = "russia"
            xarita.image2 = china
            xarita.name2 = "china"
            xarita.image3 = mongolia
            xarita.name3 = "mongolia"
            xarita.image4 = pakistan
            xarita.name4 = "pakistan"
            xarita.image5 = nepal
            xarita.name5 = "nepal"
            xarita.image6 = vietnam
            xarita.name6 = "vietnam"
            xarita.image7 = tailand
            xarita.name7 = "tailand"
            xarita.image8 = korea
            xarita.name8 = "korea"
            xarita.image9 = uzbekistan
            xarita.name9 = "uzbekistan"
            xarita.image10 = japan
            xarita.name10 = "japan"


            startActivity(Intent(this, FlagActivity::class.java))
            finish()
        }
        YeyropaDavlatlari.setOnClickListener {

            xarita.image1 = england
            xarita.name1 = "england"

            xarita.image2 = frace
            xarita.name2 = "france"

            xarita.image3 = norway
            xarita.name3 = "norway"

            xarita.image4 = poland
            xarita.name4 = "poland"

            xarita.image5 = italy
            xarita.name5 = "italy"

            xarita.image6 = ruminiya
            xarita.name6 = "ruminiya"

            xarita.image7 = ukraine
            xarita.name7 = "ukraine"

            xarita.image8 = turkey
            xarita.name8 = "turkey"

            xarita.image9 = spain
            xarita.name9 = "spain"

            xarita.image10 = portugal
            xarita.name10 = "portugal"

            startActivity(Intent(this, FlagActivity::class.java))
            finish()
        }
        AfrikaDavlatlari.setOnClickListener {
            xarita.image1 = tunis
            xarita.name1 = "tunis"

            xarita.image2 = morocco
            xarita.name2 = "morocco"

            xarita.image3 = liviya
            xarita.name3 = "liviya"

            xarita.image4 = mauritania
            xarita.name4 = "mauritania"

            xarita.image5 = kenya
            xarita.name5 = "kenya"

            xarita.image6 = tanzania
            xarita.name6 = "tazania"

            xarita.image7 = zimbabawe
            xarita.name7 = "zimbabwe"

            xarita.image8 = angola
            xarita.name8 = "angola"

            xarita.image9 = mazambique
            xarita.name9 = "mazambique"

            xarita.image10 = congo
            xarita.name10 = "congo"
            startActivity(Intent(this, FlagActivity::class.java))
            finish()
        }
        shAmerikaDavlatlari.setOnClickListener {
            xarita.image1 = otttawa
            xarita.name1 = "ottawa"

            xarita.image2 = toronto
            xarita.name2 = "toronto"

            xarita.image3 = chicago
            xarita.name3 = "chicago"

            xarita.image4 = kanada
            xarita.name4 = "canada"

            xarita.image5 = mexico
            xarita.name5 = "mexico"

            xarita.image6 = cuba
            xarita.name6 = "cuba"

            xarita.image7 = guatemola
            xarita.name7 = "guatemola"

            xarita.image8 = nicaragua
            xarita.name8 = "nicaragua"

            xarita.image9 = ssha
            xarita.name9 = "csha"

            xarita.image10 = poerto
            xarita.name10 = "puerto rico"
            startActivity(Intent(this, FlagActivity::class.java))
            finish()
        }

        jamerikaDavlatlari.setOnClickListener {
            xarita.image1 = venezuella
            xarita.name1 = "venezuella"

            xarita.image2 = columbia
            xarita.name2 = "coulumbia"

            xarita.image3 = suriname
            xarita.name3 = "surinam"

            xarita.image4 = ekvador
            xarita.name4 = "ekvador"

            xarita.image5 = peru
            xarita.name5 = "peru"

            xarita.image6 = brazil
            xarita.name6 = "brazil"

            xarita.image7 = chili
            xarita.name7 = "chili"

            xarita.image8 = urugvay
            xarita.name8 = "urugvay"

            xarita.image9 = argentina
            xarita.name9 = "argentina"

            xarita.image10 = bolivia
            xarita.name10 = "bolivia"
            startActivity(Intent(this, FlagActivity::class.java))
            finish()
        }

        orollar.setOnClickListener {
            xarita.image1 = filipino
            xarita.name1 = "filipino"

            xarita.image2 = indonesia
            xarita.name2 = "indonesia"

            xarita.image3 = malaysia
            xarita.name3 = "malaysia"

            xarita.image4 = madagaskar
            xarita.name4 = "madagaskar"

            xarita.image5 = zealand
            xarita.name5 = "zealand"

            xarita.image6 = greenland
            xarita.name6 = "greenland"

            xarita.image7 = iceland
            xarita.name7 = "iceland"

            xarita.image8 = kuba
            xarita.name8 = "cuba"

            xarita.image9 = gvineya
            xarita.name9 = "gvineya"

            xarita.image10 = tasmania
            xarita.name10 = "tasmaniya"
            startActivity(Intent(this, FlagActivity::class.java))
            finish()
        }
    }
}
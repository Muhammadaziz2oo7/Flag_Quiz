package uz.muhamadaziz.flagquizn2tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_flag.*

class FlagActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var flagList: ArrayList<FlagData>
    private var count = 0
    private var sana = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag)


        loadData()
        setData(count)

        back.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }

    private fun setData(count: Int) {
        if (count != flagList.size) {
            countyFlag.setImageResource(flagList[count].FlagImage)
            val randomCountry = randomCountry(flagList[count].FlagName.toUpperCase())

            for (i in 0 until randomCountry.size) {
                val button = Button(this)
                button.layoutParams =
                    LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        1.0f
                    )
                button.setOnClickListener(this)
                button.text = randomCountry[i]
                button.setBackgroundResource(R.drawable.chekkasi)
                liner2.addView(button)
            }
        }
    }

    private fun randomCountry(countryName: String): List<String> {

        val stringList = ArrayList<String>()
        val length = countryName.length

        for (i in 0 until length) {
            stringList.add(countryName[i].toString())
        }
        stringList.shuffle()
        return stringList
    }

    private fun loadData() {
        flagList = ArrayList()

        flagList.add(FlagData(xarita.name1,xarita.image1))
        flagList.add(FlagData(xarita.name2,xarita.image2))
        flagList.add(FlagData(xarita.name3,xarita.image3))
        flagList.add(FlagData(xarita.name4,xarita.image4))
        flagList.add(FlagData(xarita.name5,xarita.image5))
        flagList.add(FlagData(xarita.name6,xarita.image6))
        flagList.add(FlagData(xarita.name7,xarita.image7))
        flagList.add(FlagData(xarita.name8,xarita.image8))
        flagList.add(FlagData(xarita.name9,xarita.image9))
        flagList.add(FlagData(xarita.name10,xarita.image10))
        flagList.shuffle()
    }

    override fun onClick(view: View?) {
        val button = view as Button
        button.visibility = View.INVISIBLE
        val mainButton = Button(this)
        mainButton.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT,
            1.0f
        )
        mainButton.text = button.text.toString()
        mainButton.setBackgroundResource(R.drawable.chekkasi)
        liner1.addView(mainButton)

        clear.setOnClickListener {
            liner1.removeAllViews()
            liner2.removeAllViews()
           setData(count)


        }



        val child = liner1.childCount

        if (child == flagList[count].FlagName.length) {
            val stringBuilder = StringBuilder()
            for (i in 0 until child) {
                val btn = liner1.getChildAt(i) as Button
                stringBuilder.append(btn.text.toString())
            }
            if (stringBuilder.toString() == flagList[count].FlagName.toUpperCase()) {
                count++
                sana += 1
                hisoblagich.text = sana.toString()
                liner1.removeAllViews()
                liner2.removeAllViews()
                setData(count)
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            }else {
                liner1.removeAllViews()
                liner2.removeAllViews()
                setData(count)
                Toast.makeText(this, "Qaytadan kiriting", Toast.LENGTH_SHORT).show()
            }

            if (count == flagList.size) {
                startActivity(Intent(this, Yutuq::class.java))
                sana = 0
                hisoblagich.text = sana.toString()
                count = 0
                setData(count)
            }

        }
    }
}
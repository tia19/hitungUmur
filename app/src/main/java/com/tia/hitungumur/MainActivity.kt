package com.tia.hitungumur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {
            //deklarasi edit text
            val tahunLahir = etInputUmur.text.toString()

            //get tahun saat ini  dengan menggunakan calendar
            val tahun: Int = Calendar.getInstance().get(Calendar.YEAR)

            //get umur = tahun ini dikurangi dengan input pada text
            var umur = 0
            if (tahunLahir.toIntOrNull() != null){
                umur = tahun - tahunLahir.toInt()
                tvUmur.text = "Umur = $umur tahun"
            }else{
                tvUmur.text = "Tahun tidak valid"
            }
        }
    }
}

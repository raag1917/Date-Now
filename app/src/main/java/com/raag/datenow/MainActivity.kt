package com.raag.datenow


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raag.datenow.databinding.ActivityMainBinding
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding.inflate(layoutInflater).apply{
        setContentView(root)
            btnGenerateDateNow.setOnClickListener {

                val date = System.currentTimeMillis()
                @SuppressLint("SimpleDateFormat")
                val sdf = SimpleDateFormat("MMMM dd.yyyy h:mm:ss a")
                val dateString = sdf.format(date).toString()


                tvDateNow.text = dateString
            }
        }
    }
}
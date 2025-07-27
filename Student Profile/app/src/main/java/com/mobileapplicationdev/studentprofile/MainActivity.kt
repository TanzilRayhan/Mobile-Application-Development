package com.mobileapplicationdev.studentprofile

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var uname: EditText
    lateinit var sid: EditText
    lateinit var email: EditText
    lateinit var cgpa: EditText
    lateinit var credits: EditText
    lateinit var rb1: RadioButton
    lateinit var rb2: RadioButton
    lateinit var rb3: RadioButton
    lateinit var cb1: CheckBox
    lateinit var cb2: CheckBox
    lateinit var cb3: CheckBox
    lateinit var btn: Button
    lateinit var info: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        uname=findViewById(R.id.uname)
        sid=findViewById(R.id.sid)
        email=findViewById(R.id.email)
        cgpa=findViewById(R.id.cgpa)
        credits=findViewById(R.id.credits)
        rb1=findViewById(R.id.rb1)
        rb2=findViewById(R.id.rb2)
        rb3=findViewById(R.id.rb3)
        cb1=findViewById(R.id.cb1)
        cb2=findViewById(R.id.cb2)
        cb3=findViewById(R.id.cb3)
        btn=findViewById(R.id.btn)
        info=findViewById(R.id.info)

        btn.setOnClickListener {
            var value = uname.text.toString()
            value+=" "+sid.text.toString()
            value+=" "+email.text.toString()
            value+=" "+cgpa.text.toString()
            value+=" "+credits.text.toString()
            if(rb1.isChecked)
            {
                value+=", "+rb1.text
            }
            if(rb2.isChecked)
            {
                value+=", "+rb2.text
            }
            if(rb3.isChecked)
            {
                value+=", "+rb3.text
            }
            if(cb1.isChecked)
            {
                value+=", "+cb1.text
            }
            if(cb2.isChecked)
            {
                value+=", "+cb2.text
            }
            if(cb3.isChecked)
            {
                value+=", "+cb3.text
            }

            info.visibility= View.VISIBLE
            info.setText(value)
        }
    }
}
package com.appdev.demo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var password: EditText
    lateinit var email: EditText
    lateinit var phone: EditText
    lateinit var btn: EditText
    lateinit var output: EditText
    lateinit var male:EditText
    lateinit var female:EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
//
                name = findViewById(R.id.name)
                age = findViewById(R.id.age)
                email = findViewById(R.id.email)
                password = findViewById(R.id.password)
                phone = findViewById(R.id.phone)
                btn = findViewById(R.id.btn)
                output = findViewById(R.id.output)
                male=findViewById(R.id.male)
                female=findViewById(R.id.female)

                btn.setOnClickListener{

                }




            }



        }

    }

package com.example.tutorial2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.tutorial2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }


        binding.btnAdd.setOnClickListener(this)
        binding.btnMult.setOnClickListener(this)
        binding.btnDiv.setOnClickListener(this)
        binding.btnSub.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        val a = binding.etA.text.toString().toDouble()
        val b = binding.etB.text.toString().toDouble()
        var result = 0.0

        when (v?.id) {
            R.id.btn_add -> {
                result = a + b
            }

            R.id.btn_sub -> {
                result = a - b
            }

            R.id.btn_mult -> {
                result = a * b
            }

            R.id.btn_div -> {
                result = a / b
            }
        }
        binding.resultTv.text = "Result is: $result"
    }
}
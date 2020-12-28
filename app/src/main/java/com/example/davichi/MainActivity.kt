package com.example.davichi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.davichi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    //binding 변수로 binding 처리
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)//기존
        binding= ActivityMainBinding.inflate(layoutInflater) //binding
        val view=binding.root//binding
        setContentView(view)//기존

        binding.buttonOneName.setOnClickListener{
            Toast.makeText(this,"해리 버튼입니다",Toast.LENGTH_LONG).show()
            val one= Intent(this, realharry::class.java)
            startActivity(one)
        }

        binding.buttonTwoName.setOnClickListener{
            Toast.makeText(this,"민경 버튼입니다",Toast.LENGTH_LONG).show()
            val two= Intent(this, harryphoto::class.java)
            startActivity(two)
        }

        binding.buttonThreeName.setOnClickListener{
            Toast.makeText(this,"규영 버튼입니다",Toast.LENGTH_LONG).show()
            val three= Intent(this, kyu::class.java)
            startActivity(three)
        }

        binding.buttonFourName.setOnClickListener{
            Toast.makeText(this,"민시 버튼입니다",Toast.LENGTH_LONG).show()
            val four= Intent(this, si::class.java)
            startActivity(four)
        }
    }


}



package com.example.project4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView; lateinit var text2 : TextView
    lateinit var chkAgree : CheckBox
    lateinit var rGroup : RadioGroup
    lateinit var rDog : Button; lateinit var rCat : Button; lateinit var rRabbit : Button
    lateinit var btnOK : Button
    lateinit var imgPet : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("애완동물 사진 보기")

        text1 = findViewById(R.id.Text1)
        text2 = findViewById(R.id.Text2)
        chkAgree = findViewById(R.id.ChkAgree)
        rGroup = findViewById(R.id.Rgroup1)
        rDog = findViewById(R.id.Rdog)
        rCat = findViewById(R.id.Rcat)
        rRabbit = findViewById(R.id.Rrabbit)
        btnOK = findViewById(R.id.BtnOK)
        imgPet = findViewById(R.id.ImgPet)

        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            if(chkAgree.isChecked == true)
            {
                text2.setVisibility(View.VISIBLE)
                rGroup.setVisibility(View.VISIBLE)
                btnOK.setVisibility(View.VISIBLE)
                imgPet.setVisibility(View.VISIBLE)
            }
            else
            {
                text2.setVisibility(View.INVISIBLE)
                rGroup.setVisibility(View.INVISIBLE)
                btnOK.setVisibility(View.INVISIBLE)
                imgPet.setVisibility(View.INVISIBLE)
            }
        }

        btnOK.setOnClickListener {
            when(rGroup.checkedRadioButtonId){
                R.id.Rdog -> imgPet.setImageResource(R.drawable.dog)
                R.id.Rcat -> imgPet.setImageResource(R.drawable.cat)
                R.id.Rrabbit -> imgPet.setImageResource(R.drawable.rabbit)
            }
        }

    }
}
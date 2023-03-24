package com.geminiboy.latihanchap3.tugasSerializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geminiboy.latihanchap3.R
import com.geminiboy.latihanchap3.databinding.ActivitySerializabe2Binding

class SerializabeActivity2 : AppCompatActivity() {
    lateinit var binding: ActivitySerializabe2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySerializabe2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val menDapatkanData = intent.getSerializableExtra("DATAUSER") as DataClass
        val nama = menDapatkanData.name
        val email1 = menDapatkanData.email
        val noPhone = menDapatkanData.numberPhone
        val adress2 = menDapatkanData.address
        val age2 = menDapatkanData.age
        binding.textName.text = nama
        binding.textEmail.text = email1
        binding.textPhone.text = noPhone
        binding.textAddress.text = adress2
        binding.textAge.text = age2
    }
}
package com.geminiboy.latihanchap3.tugasSerializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geminiboy.latihanchap3.R
import com.geminiboy.latihanchap3.databinding.ActivitySerializabeBinding

class SerializabeActivity : AppCompatActivity() {
    lateinit var binding: ActivitySerializabeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySerializabeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSerializable.setOnClickListener{
            val name1 = binding.inputName.text.toString()
            val email1 = binding.inputEmail.text.toString()
            val phone1 = binding.inputPhone.text.toString()
            val addres1 = binding.inputAddress.text.toString()
            val age1 = binding.inputAge.text.toString()

            val myData = DataClass(name1,email1, phone1, addres1, age1)
            val pindah = Intent(this, SerializabeActivity2::class.java)
            pindah.putExtra("DATAUSER", myData)
            startActivity(pindah)
    }
}
}
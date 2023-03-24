package com.geminiboy.latihanchap3.tugasParcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geminiboy.latihanchap3.R
import com.geminiboy.latihanchap3.databinding.ActivityParcelable2Binding


class ParcelableActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityParcelable2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityParcelable2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val getDataUser = intent.getParcelableExtra("KUNCIDATA") as DataUser?
        val nama3 = getDataUser!!.name
        val email3 = getDataUser.email
        val phoneNum3 = getDataUser.phone
        val address3 = getDataUser.address
        val age3 = getDataUser.age

        binding.textNameParce.text = nama3
        binding.textEmailParce.text = email3
        binding.textPhoneParce.text = phoneNum3.toString()
        binding.textAddressParce.text = address3
        binding.textAgeParce.text = age3.toString()
    }
}
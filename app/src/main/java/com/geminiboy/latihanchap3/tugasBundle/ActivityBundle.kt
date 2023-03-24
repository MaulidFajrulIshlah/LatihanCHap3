package com.geminiboy.latihanchap3.tugasBundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geminiboy.latihanchap3.R
import com.geminiboy.latihanchap3.databinding.ActivityBundleBinding

class ActivityBundle : AppCompatActivity() {

    lateinit var binding : ActivityBundleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener{
            val namaUser = binding.masukanNama.text.toString()
            val umurUser = binding.masukanTahunLahir.text.toString().toInt()
            val bundle = Bundle()
            val move = Intent(this,ActivityBundle2::class.java)
            bundle.putString("Halo", namaUser)
            bundle.putInt("Umur Kamu", umurUser)
            move.putExtras(bundle)
            startActivity(move)
        }
    }
}
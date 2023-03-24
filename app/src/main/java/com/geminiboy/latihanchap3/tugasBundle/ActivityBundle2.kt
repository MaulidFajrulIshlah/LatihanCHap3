package com.geminiboy.latihanchap3.tugasBundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geminiboy.latihanchap3.R
import com.geminiboy.latihanchap3.databinding.ActivityBundle2Binding
import com.geminiboy.latihanchap3.databinding.ActivityBundleBinding

class ActivityBundle2 : AppCompatActivity() {

    lateinit var binding : ActivityBundle2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBundle2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val getbundle = intent.extras
        val name = getbundle?.getString("Halo")
        val umur = getbundle?.getInt("Umur Kamu")
        binding.textView.text = "halo, $name"
        binding.textUmur.text = "umur kamu adalah : $umur"
    }
}
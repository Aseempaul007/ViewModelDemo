package com.example.livedatademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.livedatademo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        var viewModel: MainActivityViewModel=
            ViewModelProvider(this).get(MainActivityViewModel::class.java)

        mainBinding.textView.setText(viewModel.num.toString())

        mainBinding.button.setOnClickListener {
            viewModel.addOne()
            mainBinding.textView.setText(viewModel.num.toString())
        }


    }
}
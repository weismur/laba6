package com.example.lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberViewModel:ViewModel(){
    // Create a LiveData with a random number
    val currentRandomNumber:MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun generate(v: View){
        val rnd: Int = (0..50).random()
        val button:Button = findViewById(R.id.getRnd)
        val input:EditText = findViewById(R.id.rndNum)
        input.setText("$rnd")
    }
}

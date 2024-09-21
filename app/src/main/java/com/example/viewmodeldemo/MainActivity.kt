package com.example.viewmodeldemo

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewmodeldemo.databinding.ActivityMainBinding
import com.example.viewmodeldemo.viewmodel.CounterViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val counterViewModel : CounterViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.textView.text = counterViewModel.counter.toString()
        binding.countbtn.setOnClickListener {
            counterViewModel.increment()
            binding.textView.text = counterViewModel.counter.toString()
        }

            binding.countdecbtn.setOnClickListener {
            counterViewModel.decrement()
            binding.textView.text = counterViewModel.counter.toString()
        }
            binding.resetbtn.setOnClickListener {
            counterViewModel.reset()
            binding.textView.text = counterViewModel.counter.toString()
        }
    }

}
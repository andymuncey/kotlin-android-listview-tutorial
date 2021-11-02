package com.tinyappco.todo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tinyappco.todo.databinding.ActivityTaskEditBinding

private lateinit var binding : ActivityTaskEditBinding

class TaskEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTaskEditBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    fun onSaveClick(view: View){
        val intent = Intent()
        intent.putExtra("task_text", binding.editText.text.toString())
        setResult(Activity.RESULT_OK, intent)
        finish()
    }


}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnSomar = findViewById(R.id.btnSomar) as Button;

        btnSomar.setOnClickListener {
            if(edNumero1.text.isNotEmpty() && edNumero2.text.isNotEmpty()){
                val resultado : Int = edNumero1.text.toString().toInt() + edNumero2.text.toString().toInt();
//                Toast.makeText(this@MainActivity, "O resultado é $resultado", Toast.LENGTH_LONG).show();

                val intent = Intent(this, DisplayMessageActivity::class.java).apply {
                    putExtra("resultado", resultado.toString())
                }
                startActivity(intent);
            }else{
                Toast.makeText(this@MainActivity, "Preencher os dois campos", Toast.LENGTH_LONG).show();
            }

        }
    }
}

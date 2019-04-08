package com.example.agendamc.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.agendamc.R
import kotlinx.android.synthetic.main.activity_buscar.*
import kotlinx.android.synthetic.main.activity_cadastro.*

class BuscarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar)

        val Toolbar = toolbar3
        setSupportActionBar(toolbar3)
        supportActionBar!!.title = ""
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        btnBuscar.setOnClickListener {
            buscar(editBuscar.text.toString())
        }


    }

     fun buscar(busca: String) {
        if (busca != ""){
            Toast.makeText(this@BuscarActivity,"$busca",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this@BuscarActivity,"Digite sua busca",Toast.LENGTH_SHORT).show()
        }
    }

}

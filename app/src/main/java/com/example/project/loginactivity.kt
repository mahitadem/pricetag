package com.example.project

import android.content.Intent
import android.graphics.ColorSpace.Model
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.annotation.RequiresApi

class loginactivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)
//
        val listviewm=findViewById<ListView>(R.id.mylist)
        val mrk= arrayOf("Naivas","Carrfour","Quickmart","Cleanshelf")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,mrk)
        listviewm.adapter=arrayAdapter
//
        listviewm.setOnItemClickListener { adapterView, view, position, l ->
//            Toast.makeText(this,"You have clicked on"+ mrk(position), Toast.LENGTH_LONG).show()
//            val intent=Intent(this,naivas1::class.java)
//            startActivity(intent)
        }

        var listView= findViewById<ListView>(R.id.mylist)
        var list= mutableListOf<Model>()


//        //adding images
//        listviewm.add(Model(",R.id.webview))
//        listviewm.add(Model("Whatsapp","Whatsapp description",R.id.web2))
//        listviewm.add(Model("Youtube","youtube description",R.id.web3))
//        listviewm.add(Model("Instagram","instagram description",R.id.web4))
//        listviewm.add(Model("Twitter","Twitter description",R.drawable.twitter))


//        listviewm.adapter=MyAdapter(this,R.layout.row,list)

        listviewm.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->

            if (position==0){
                listviewm.setOnItemClickListener { adapterView, view, position, l ->
                    val intent=Intent(this,naivas1::class.java)
                    startActivity(intent)
                }

            }
            if (position==1){
                listviewm.setOnItemClickListener { adapterView, view, position, l ->
                    val intent=Intent(this,carrfour::class.java)
                    startActivity(intent)
                }
            }
            if (position==2){
                listviewm.setOnItemClickListener { adapterView, view, position, l ->
                    val intent=Intent(this,quickmart::class.java)
                    startActivity(intent)
                }
            }
            if (position==3){
                listviewm.setOnItemClickListener { adapterView, view, position, l ->
                    val intent=Intent(this,cleanshelf::class.java)
                    startActivity(intent)
                }
            }
//            if (position==4){
//                Toast.makeText(this@loginactivity,"You have clicked on Twitter!",Toast.LENGTH_LONG).show()
//
//            }
    }

//    private fun mrk(position: Int) {

    }
}
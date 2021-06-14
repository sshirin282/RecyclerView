package com.example.myrecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class recycleView : AppCompatActivity() {
 lateinit var recycleView: RecyclerView
    lateinit var adapterRcy: AdapterRcy
    val name= arrayOf<String>("Apple", "Banana", "Guavas", "Kiwi", "Lemon", "Mango", "Orange", "Watermelon","Pomegranate","Muskmelon","Cherry")
    val des= arrayOf<String>("Apple trees are large if grown from seed. Generally, apple cultivars are propagated by grafting onto rootstocks, which control the size of the resulting tree.",
    "Bananas are among the most important food crops on the planet.","Guavas are tropical trees originating in Central America.",
    "Kiwifruit is native to central and eastern China.", "The tree's ellipsoidal yellow fruit is used for culinary and non-culinary purposes throughout the world, primarily for its juice,",
    " mango is an edible stone fruit produced by the tropical tree Mangifera indica which is believed to have originated from the region between northwestern Myanmar, Bangladesh, and northeastern India.",
    "The orange originated in a region encompassing Southern China, Northeast India, and Myanmar,","Watermelon (Citrullus lanatus) is a flowering plant species of the Cucurbitaceae family."
    ,"The pomegranate (Punica granatum) is a fruit-bearing deciduous shrub in the family Lythraceae, subfamily Punicoideae, that grows between 5 and 10 m ",
    "Cucumis melo, also known as melon,[2][3] is a species of Cucumis that has been developed into many cultivated varieties. The fruit is a pepo",
    "A cherry is the fruit of many plants of the genus Prunus, and is a fleshy drupe (stone fruit).")
    val image= arrayOf<Int>(R.drawable.apple,R.drawable.banana,R.drawable.gavava,R.drawable.kiwi,
    R.drawable.lemon,R.drawable.mango,R.drawable.orange,R.drawable.watermelon, R.drawable.pomo, R.drawable.melon,R.drawable.cherry)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycleView=findViewById(R.id.rec)

        adapterRcy= AdapterRcy(this,name,des,image)
        val layoutManager= LinearLayoutManager(applicationContext)
        recycleView.layoutManager=layoutManager
        recycleView.adapter=adapterRcy

    }
}
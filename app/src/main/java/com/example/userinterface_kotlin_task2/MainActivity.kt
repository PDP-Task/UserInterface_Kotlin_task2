package com.example.userinterface_kotlin_task2

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.google.android.material.button.MaterialButton
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator

class MainActivity : AppCompatActivity() {
    private lateinit var myDotsIndicator: MyDotsIndicator
    private lateinit var myAdapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var lottieAnim: LottieAnimationView
    private lateinit var getBtn: MaterialButton
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titles = listOf(
            "Say Hello to\nGlobal Top-Up",
            "Say Hi to\nGlobal Top-Up",
            "Say Hello to\nGlobal Top-Up"
        )

        val des = listOf(
            "Say Hello to\nGlobal Top-Up, Global Top-Up",
            "Say Hi to\nGlobal Top-Up, Global Top-Up",
            "Say Hello to\nGlobal Top-Up, Global Top-Up"
        )
        lottieAnim = findViewById(R.id.lottie_anim)
        recyclerView = findViewById(R.id.recyclerview)
        getBtn = findViewById(R.id.get_btn)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager
        myAdapter = MyAdapter(this, titles, des)
        val snapHelper = PagerSnapHelper()
        myDotsIndicator = MyDotsIndicator()
        snapHelper.attachToRecyclerView(recyclerView)
        recyclerView.adapter = myAdapter
        myDotsIndicator.setDotColor(-0x22000000, 0x33000000)
        recyclerView.addItemDecoration(myDotsIndicator)
    }
}
// if (lastVisible == 3) {
//                    getBtn.visibility = View.VISIBLE
//                }
//                when (totalItemCount) {
//                    1 -> {
//                        lottieAnim.setAnimation(R.raw.anim_1)
//                        getBtn.visibility = View.GONE
//                    }
//                    2 -> {
//                        lottieAnim.setAnimation(R.raw.anim_2)
//                        getBtn.visibility = View.GONE
//                    }
//                    3 -> {
//                        lottieAnim.setAnimation(R.raw.anim_3)
//                        getBtn.visibility = View.VISIBLE
//                    }
//                }
//                lottieAnim.playAnimation()
package com.example.kakaotalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.yogiyo_clone.home.HomeFragment
import com.example.yogiyo_clone.mypage.MyPageFragment
import com.example.yogiyo_clone.order.ChatFragment
import com.example.yogiyo_clone.search.ViewFragment
import com.example.yogiyo_clone.star.ShoppingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val chatFragment = ChatFragment()
        val shoppingFragment = ShoppingFragment()
        val view = ViewFragment()
        val myPage = MyPageFragment()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        replaceFragment(homeFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(homeFragment)
                R.id.chat -> replaceFragment(chatFragment)
                R.id.shopping -> replaceFragment(shoppingFragment)
                R.id.view -> replaceFragment(view)
                R.id.myPage -> replaceFragment(myPage)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.fragmentContainer, fragment)
                commit()
            }
    }
}
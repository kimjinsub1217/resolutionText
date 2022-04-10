package com.example.yogiyo_clone.mypage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.kakaotalk.R
import com.example.kakaotalk.databinding.FragmentMypageBinding


class MyPageFragment: Fragment(R.layout.fragment_mypage) {

    private var binding: FragmentMypageBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentMyPageBinding = FragmentMypageBinding.bind(view)
        binding = fragmentMyPageBinding
    }
}
package com.kidsgamesprojects.childduties.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.kidsgamesprojects.childduties.R
import com.kidsgamesprojects.childduties.databinding.FragmentHomeBinding
import com.kidsgamesprojects.childduties.databinding.ItemBinding

class HomeFragment : Fragment() {
    private val homeViewModel: HomeViewModel by activityViewModels()
    private var _binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false).apply {
            fragment = this@HomeFragment
            viewModel = this@HomeFragment.homeViewModel
            lifecycleOwner = this@HomeFragment
        }
        return _binding?.root
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding?.apply{
            cvOne.tvName.text="Bartek"
            cvOne.svAvatar.setImageDrawable(context?.getDrawable(R.drawable.avatar_cat))

            cvTwo.tvName.text="Adam"
            cvTwo.svAvatar.setImageDrawable(context?.getDrawable(R.drawable.avatar_fox))

            cvThree.tvName.text="Karol"
            cvThree.svAvatar.setImageDrawable(context?.getDrawable(R.drawable.avatar_koala))

            cvFour.tvName.text="Piotr"
            cvFour.svAvatar.setImageDrawable(context?.getDrawable(R.drawable.avatar_squirrel))
        }
//        initOnClick()
    }

    fun initOnClick(){
//        _binding?.button?.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionNavigationHomeToChildAddOrEditFragment())
//        }


    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
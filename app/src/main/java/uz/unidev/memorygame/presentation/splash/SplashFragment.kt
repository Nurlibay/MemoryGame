package uz.unidev.memorygame.presentation.splash

import android.animation.Animator
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.unidev.memorygame.R
import uz.unidev.memorygame.databinding.FragmentSplashBinding

/**
 *  Created by Nurlibay Koshkinbaev on 13/09/2022 12:08
 */

@AndroidEntryPoint
class SplashFragment : Fragment(R.layout.fragment_splash) {

    private val binding: FragmentSplashBinding by viewBinding()
    private val navController: NavController by lazy { findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //binding.lottieView.setMaxProgress(0.6f)
        binding.lottieView.addAnimatorListener(object : Animator.AnimatorListener {

            override fun onAnimationStart(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                navController.navigate(SplashFragmentDirections.actionSplashFragmentToLevelFragment())
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationRepeat(animation: Animator?) {
            }
        })
    }
}
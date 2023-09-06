package com.lucao.desafiomodulodoze

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.lucao.desafiomodulodoze.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val homeFragment = FragmentHomeBinding.inflate(inflater, container, false)

        homeFragment.startActivityButton.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToNavigation()
            findNavController().navigate(action)
        }

        // Inflate the layout for this fragment
        return homeFragment.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.setting_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(findNavController())
    }
}
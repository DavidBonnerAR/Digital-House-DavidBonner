package com.example.arquitetura.home.view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.arquitetura.R
import com.example.arquitetura.home.repository.TarefaRepository
import com.example.arquitetura.home.viewmodel.TarefaViewModel

class HomeFragment : Fragment() {
    lateinit var minhaView: View
    lateinit var viewModel: TarefaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        minhaView = inflater.inflate(R.layout.fragment_home, container, false)

        return minhaView
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        viewModel = ViewModelProvider(
            this,
            TarefaViewModel.TarefaViewModelFactory(TarefaRepository())
        ).get(TarefaViewModel::class.java)

        viewModel.listaDeTarefasData.observe(viewLifecycleOwner , {
            minhaView.findViewById<TextView>(R.id.txtTarefa1)

        })

    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}
package com.example.arquitetura.home.repository

import com.example.arquitetura.home.model.Tarefa
import java.util.*

class TarefaRepository {
    fun obterTarefas(callback: (tarefas: List<Tarefa>) -> Unit): List<Tarefa>{
        val listaDeTarefas = obterDoBanco()

        callback.invoke(listaDeTarefas)
    }

    fun obterDoBanco(): List<Tarefa>{
        return listOf(
            Tarefa("Minha Tarefa 1", "TODO", Date()),
            Tarefa("Minha Tarefa 2", "TODO", Date()),
            Tarefa("Minha Tarefa 3", "TODO", Date())
        )

    }
}
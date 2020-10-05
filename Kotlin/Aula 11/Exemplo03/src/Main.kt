fun main(){
    val aluno1 = Aluno("D1", 1)
    val aluno2 = Aluno("D2", 2)
    val aluno3 = Aluno("D3", 3)
    val aluno4 = Aluno("D4", 4)
    val listaAlunos = arrayListOf(aluno1, aluno2, aluno3, aluno4)
    val aluno5 = Aluno("D5", 3)
    println(listaAlunos.contains(aluno5))
    //Com a mudança o aluan está na lista
}
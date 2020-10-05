fun main(){
    val passaro = Passaro()

    fazVoar(passaro)
    fazComer(passaro)
}

fun fazVoar(coisasQueVoam: ICoisasQueVoam){
    coisasQueVoam.voar()
}

fun fazComer(comem: ICoisasQueComem){
    comem.comer()
}
package arrays
fun main(){
    val operationalSystems = intArrayOf(0, 0, 0, 0, 0, 0);
    val operationalSystemsNames = arrayOf("Windows Server     ", "Unix               ", "Linux              ",
        "Netware            ", "Mac OS             ", "Outros             ");

    do{
        println("Digite 0 - para sair, 1- para votar em Windows Server, 2- para votar em Unix, 3- para votar em Linux " +
                "4- para votar em Netware, 5- para votar em Mac OS e 6- para votar em outros")
        var vote = readLine()!!.toInt();

        if(vote < 0 || vote > 6){
            println("Voto inválido");
            continue;
        }
        else if(vote == 0)
            break;

        operationalSystems[vote-1]++;
    }while(true)

    var sum = 0.0;
    sum = operationalSystems.sum().toDouble();

    println("SISTEMA OPERACIONAl       |       VOTOS       |           %");
    for(x in 0..5){
        var percentage = (operationalSystems[x] * 100) / sum;

        println(operationalSystemsNames[x] + "       |       " + operationalSystems[x] + "           |           " + "%.2f".format(percentage) + "%");
    }
    print("Total de votos: $sum");
}
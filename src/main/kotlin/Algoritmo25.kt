// Código original
//prog teste
//int data, dia, mes, ano;
//imprima "\nDigite data no formato DDMMAA: ";
//leia data;
//dia <- data div 10000;
//mes <- data % 10000 div 100;
//ano <- data % 100;
//imprima "\nDIA: ", dia;
//imprima "\nMES: ", mes;
//imprima "\nANO: ", ano;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {

    print("Digite data no formato DDMMAA: ")

    val data = readln().toInt()

    // Separa o dia, o mês e o ano

    val dia = data / 10000

    val mes = (data % 10000) / 100

    val ano = data % 100

    println("\nDIA: $dia")

    println("MES: $mes")

    println("ANO: $ano")

}
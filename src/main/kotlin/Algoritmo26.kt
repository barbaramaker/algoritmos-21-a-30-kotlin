// Código original
// prog teste
//int data, dia, mes, ano, ndata;
//imprima "\nDigite data no formato DDMMAA: ";
//leia data;
//dia <- data div 10000;
//mes <- data % 10000 div 100;
//ano <- data % 100;
//ndata <- mes * 10000 + dia * 100 + ano;
//imprima "\nDIA: ", dia;
//imprima "\nMES: ", mes;
//imprima "\nANO: ", ano;
//imprima "\n\nDATA NO FORMATO MMDDAA: ", ndata;
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

    // Reorganiza a data para o formato MMDDAA

    val ndata = mes * 10000 + dia * 100 + ano

    println("\nDIA: $dia")

    println("MES: $mes")

    println("ANO: $ano")

    println("\nDATA NO FORMATO MMDDAA: $ndata")

}
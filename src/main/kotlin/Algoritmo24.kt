// Código original
// prog teste
//int a, d;
//imprima "\nDigite numero de tres casas: ";
//leia a;
//d <- a div 10 % 10;
//imprima "\nalgarismo da casa das dezenas: ", d;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {

    print("Digite numero de tres casas: ")

    val a = readln().toInt()

    // Primeiro realiza a divisão inteira e depois calcula o resto

    val d = (a / 10) % 10

    println("algarismo da casa das dezenas: $d")

}
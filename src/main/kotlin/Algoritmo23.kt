// Código original
//prog teste
//int a, d;
//imprima "\nDigite numero de tres casas: ";
//leia a;
//d <- a % 100 div 10;
//imprima "\nalgarismo da casa das dezenas: ", d;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {

    print("Digite numero de tres casas: ")

    val a = readln().toInt()

    // Obtém os dois últimos algarismos e depois a dezena

    val d = (a % 100) / 10

    println("algarismo da casa das dezenas: $d")

}

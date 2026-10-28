// Código original

//prog teste
//  imprima "\nTESTANDO HIERARQUIA\n";
//  imprima "\nl2 + 5 /2 é igual a: ", 12 + 5 / 2;
//  imprima "\n~ DIFERENTE DE (12 + 5)/2 que é igual a: ", (12 + 5)/2,"
//  logo / tem HIERARQUIA MAIOR do que + ou -";#continuacao
//  imprima "\n\n64**1/ 4 é igual a: ",64**1/4 ;
//  imprima "\nf DIFERENTE de 64**{1/4)que é igual a: ",64**(1/4)," logo **
//  tem HIERARQUIA MAIOR do que * ou I " ;#continuacao
//  imprima "\n\n3*7 % 5 é igual a: ", 3*7 % 5;
//  imprima "\nf DIFERENTE de (3 * 7) % 5 que é igual a: ",(3 * 7) % 5, "
//  logo % tem HIERARQUIA MAIOR do que * " ;#continuacao
//  imprima "\n\n3 * 7 div 5 é igual a: ", 3*7 div 5;
//  imprima "\n~ IGUAL a (3 * 7) div 5: ",(3 * 7) div 5," logo div tem a
//  MESMA HIERARQUIA da * ou / ";#continuacao
//  imprima "\n";
//  fimprog

//  Código em Kotlin
import kotlin.math.pow

fun main() {

    println("\nTESTANDO HIERARQUIA")

    // Divisão e adição

    println("\n12 + 5.0 / 2 é igual a: ${12 + 5.0 / 2}")

    println("(12 + 5.0) / 2 é igual a: ${(12 + 5.0) / 2}")

    println("A divisão tem prioridade maior do que a adição.")

    // Potenciação e divisão

    println("\n64.0.pow(1) / 4 é igual a: ${64.0.pow(1) / 4}")

    println("64.0.pow(1.0 / 4) é igual a: ${64.0.pow(1.0 / 4)}")

    println("A potenciação é realizada antes da divisão.")

    // Multiplicação e resto da divisão

    println("\n3 * (7 % 5) é igual a: ${3 * (7 % 5)}")

    println("(3 * 7) % 5 é igual a: ${(3 * 7) % 5}")

    println("No pseudocódigo do livro, % tem prioridade maior do que *.")

    println("Em Kotlin, usamos parênteses para preservar essa ordem.")

    // Multiplicação e divisão inteira

    println("\n3 * 7 / 5 é igual a: ${3 * 7 / 5}")

    println("(3 * 7) / 5 é igual a: ${(3 * 7) / 5}")

    println("Em Kotlin, * e / possuem a mesma prioridade.")

}
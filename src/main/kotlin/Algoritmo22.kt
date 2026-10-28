// Código original
//prog teste
//  imprima "\nTESTANDO HIERARQUIA";
//  imprima "\n\nl8/ 6 % 2 é igual a: ", 18 / 6 % 2;
//  imprima "\nUma operação de divisão fora de parênteses não pode ser um
//  dos operandos de uma expressao com %.";#continuacao
//  imprima "\n\n20 / 4 div 2 é igual a: ", 20 / 4 div 2;
//  imprima "\nÉ IGUAL a (20 / 4) div 2 : ",(20 / 4) div 2," logo div tem a
//  MESMA HIERARQUIA ";#continuacao
//  imprima " da / . ";
//  imprima "\n\n30 / 4 div 2 é igual a: ", 30/4 div 2;
//  imprima "\nÉ IGUAL a (30 / 4) div 2 : ",(30 / 4) div 2," logo div tem
//  a MESMA HIERARQUIA ";#continuacao
//  imprima n da / "; 1 33
//  imprima 11 \n\n7. div 4: li ,7. div 4;
//  imprima 11 \n7 div 4: n ,7 div 4;
//  imprima 11 \n6. div 4: li ,6. div 4;
//  imprima "\n6 div 4: li ,6 div 4;
//  imprima "\n";
//fimprog

// Código em Kotlin

import kotlin.math.roundToInt
fun main() {

    println("\nTESTANDO HIERARQUIA")

    // Resto da divisão e divisão

    val resultado1 = 18.0 / (6 % 2)

    println("\n18.0 / (6 % 2) é igual a: $resultado1")

    println("No pseudocódigo do livro, % tem prioridade maior do que /.")

    println("Por isso, a divisão é feita por zero, resultando em Infinity.")

    // Divisão e divisão inteira

    println("\n20 / 4 / 2 é igual a: ${(20.0 / 4 / 2).toInt()}")

    println("(20 / 4) / 2 é igual a: ${((20.0 / 4) / 2).toInt()}")

    println("No livro, div e / possuem a mesma prioridade.")

    // Divisão com arredondamento

    println("\n30 / 4 / 2 é igual a: ${(30.0 / 4 / 2).roundToInt()}")

    println("(30 / 4) / 2 é igual a: ${((30.0 / 4) / 2).roundToInt()}")

    println("O resultado foi arredondado para reproduzir a saída do livro.")

    // Divisão com números reais e inteiros

    println("\n7.0 / 4 (com arredondamento): ${(7.0 / 4).roundToInt()}")

    println("7 / 4 (divisão inteira): ${7 / 4}")

    println("6.0 / 4 (com arredondamento): ${(6.0 / 4).roundToInt()}")

    println("6 / 4 (divisão inteira): ${6 / 4}")

}
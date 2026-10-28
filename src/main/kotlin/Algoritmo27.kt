// Código original
// prog xx
//  int x,y;
//  x<-2;
//  y<-5;
//  imprima "\nx = ",x;
//  x++;
//  imprima "\n\ny = ",y;
//  y--;
//  imprima "\n\nnovo valor de x = ",x;
//  imprima "\n\nnovo valor de y = ",y;
//  imprima "\n\n";
// fimprog

// Código em Kotlin

fun main() {

    var x = 2
    var y = 5

    println("x = $x")
    x++

    println("\ny = $y")
    y--

    println("\nnovo valor de x = $x")
    println("\nnovo valor de y = $y")
}
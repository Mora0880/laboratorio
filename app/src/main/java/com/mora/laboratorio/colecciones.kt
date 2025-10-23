package com.mora.laboratorio


fun main(){

    // lista de solo lectura
    val lecture = listOf ("cuadrado", "circulo", "rectagunlo")
    println(lecture)

    val cosasdemiapa = listOf("Cuaderno","Monitor","Medallas")
    println(cosasdemiapa)


    // listas mutables con decalracion de tipo explicita
    val shapes : MutableList <String> = mutableListOf ("manzana","pera","piña")
    print(shapes)

    val SShapes: MutableList <String> = mutableListOf("limon","cereza","trigo")
    val shapesLocked: List<String> = SShapes



}

package com.mora.laboratorio


fun main() {

    // lista de solo lectura
//    val lecture = listOf ("cuadrado", "circulo", "damiel")
//    println(lecture)
//    println("ese menor asi en chite tiene la cara como una ${lecture[2]}") //para acceder a un elemento de la lista solo usamos []
//    println("en esta lista tenemos ${lecture.count()} elementos")
//
//    val cosasdemiapa = listOf("Cuaderno","Monitor","Medallas")
//    println(cosasdemiapa)
//    println("estoy dispuesto a tomorrow ganar una ${cosasdemiapa.last()}") //para obtener el primer elemento usamo first y para el ultimo last
//    println("Monitor" in cosasdemiapa)


    // listas mutables con decalracion de tipo explicita
    val shapes : MutableList <String> = mutableListOf ("manzana","pera","piña")
    shapes.add ("cereza")
    println(shapes)


    val SShapes: MutableList <String> = mutableListOf("limon","cereza","trigo")
    SShapes.remove("limon")
    SShapes.add("cocodrilo se come todo aqui")
    val shapesLocked: List<String> = SShapes
    println(SShapes)


    val frutas: MutableSet<String> = mutableSetOf("chinola","frambuesa","tomatoes")
    frutas.add("limon")
    println(frutas)

}



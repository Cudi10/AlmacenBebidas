//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {

 /*println("Name")
 val nombre: String = readln()

 println("Apellido")
 val apellido: String = readln()

 println("Edad")
 val edad: Int = readln().toInt()

  parametros(nombre, apellido, edad)*/

    /*
     println("Mes")
     val m: Int = readln().toInt()
      Mes(m)

    Temperatura(4.4 , "grados", )
    Temperatura(32.6, "grados", )
    Temperatura(26.0, "grados", )*/

    //arrays()
   //listas()
   //mapas()
   //buclesFor()
  //bucleWhile()
  //nullSafety()
  //lambdas()
   //clases()
    //clasesAnidadas()
   // clasesInternas()
   // herencias()
   // val miMascota = Mascota("Lucas", 3)
  //  val  miMascota2 = Mascota("Blanca")
   // modificadores()
   // dataClases()
   // ejercicio4()
    almacen()
}

private fun almacen(){

    val almacen = Almacen()

    // Crear algunas bebidas
    val agua1 = AguaMineral(1, 1.5, 2.0, "Agua Cristal", "Manantial X")
    val cola = BebidaAzucarada(2, 2.0, 1.5, "Coca-Cola", 10.0, true)
    val fanta = BebidaAzucarada(3, 1.0, 1.2, "Fanta", 12.0, false)

    // Agregar bebidas al almacén
    almacen.agregarBebida(agua1, 0, 0)
    almacen.agregarBebida(cola, 1, 1)
    almacen.agregarBebida(fanta, 2, 2)

    // Mostrar bebidas
    println("\nMostrar bebida con ID 2:")
    almacen.mostrarBebida(2)

    // Calcular precios
    println("\nPrecio total de todas las bebidas: ${almacen.calcularPrecio()}")
    println("\nPrecio total de las bebidas de marca 'Coca-Cola': ${almacen.calcularPrecioMarca("Coca-Cola")}")
    println("\nPrecio total de la columna 1: ${almacen.calcularPrecioColumna(1)}")

    // Mostrar toda la estantería
    println("\nEstantería completa:")
    almacen.mostrarEstanteria()

    // Eliminar una bebida
    almacen.eliminarBebida(2)
    println("\nEstantería después de eliminar bebida con ID 2:")
    almacen.mostrarEstanteria()

}




/*
private fun modificadores(){
    val visibilidad: Visibilidad()
    visibilidad.nombre = "Lucas"
    visibilidad.diMiNombre()
}*/

private fun ejercicio4(){
    val cuenta1 = Cuenta("Lucas")
    val cuenta1Doble = cuenta1.copy(cantidad = 500f)
    val cuenta2 = Cuenta("Steve", 235.5f)
    println("Cuenta 1 = $cuenta1")
    println("Cuenta1Doble = $cuenta1Doble")
    println("Cuenta 2 = $cuenta2")
    cuenta1.ingresar(200f)
    cuenta2.retirar(350f)
    println("Cuenta 1 = $cuenta1")
    println("Cuenta 2 = $cuenta2")

}



private fun dataClases(){
    val trabajador = Trabajador()
    val  sara = Trabajador("Sara", 23, "Medico")
}

fun herencias(){
   val persona = Persona("Alberto", 53)
    println(persona)
   val programador = Programador("Maria", 34, "C")
    programador.trabajar()
    programador.imprimirLenguaje()
   val diseyador = Diseyador("Lucas", 27, "Java")
   diseyador.trabajar()

}


fun clasesInternas(){
    val  claseInterna = Principal().ClaseInterna()
    println("El resultado de la suma es" + claseInterna.sumarDos(3, 6))
}

/*
fun clasesAnidadas(){
  val claseAnidada =  Principal.ClaseAnidada()
    val suma = claseAnidada.suma(5, 8)
    print("El resultado de la suma es $suma")
}*/

class Principal(){
    private val uno = 1

    inner class ClaseInterna{
        fun  sumarDos(num1: Int, num2: Int): Int{
            return num1 + num2 + uno
        }
    }

   /* class ClaseAnidada(){
        fun suma(num1: Int, num2: Int): Int{
            return num1 + num2
        }
    }*/
}

private fun clases(){

    class Contacto(val identificador: Int, var email: String){
        val categoria: String = ""
    }

    class  Rectangulo(val ancho: Int, val alto: Int){
        var contador: Int = 20
            set(value){
                if (value >= 0){
                    //field = value
                    this.contador = value
                }
            }
        val area: Int
            get() = this.ancho * this.alto
    }


    var persona1 = Contacto(1, "jesusfd@gmail.com")

    val  rect = Rectangulo(5, 5)
    rect.alto
    class  SinConstructor private constructor()
}




fun lambdas(){
    val listaNumeros = arrayListOf(0,1,2,3,4,5,6,7,8,9,10)
    val listaFiltrados = listaNumeros.filter {miNumero ->
        if (miNumero == 1) {
            return@filter true
        }
        miNumero > 5
    }
    println(listaFiltrados)

    var miFuncionSuma = fun (x: Int, y: Int): Int = x + y
    var miFuncionMultiplicar = fun (x: Int, y: Int): Int = x * y
    println(miFuncionSuma(5, 10))
    println(miFuncionMultiplicar(5, 10))
    println(miFuncionOperacion(5, 10, { x, y -> x - y}))
    println(miFuncionOperacion(5, 10, miFuncionSuma))

    lambdasTemperatura(27.0, "Celsius", "Fahhrenheit", {9.0/5.0 * it + 32} )
    lambdasTemperatura(350.0, "Kelvin", "Celsius", {it - 273.15} )
    lambdasTemperatura(10.0, "Fahhrenheit", "Kelvin", {5.0/9.0 * (it - 32) + 273.15} )

}

fun miFuncionOperacion(x: Int, y: Int, miFuncion: (Int, Int) -> Int): Int {
    return miFuncion(x, y)
}


fun lambdasTemperatura(medidaInicial:  Double, escalaInicial: String, escalaFinal: String, formulaConversion: (Double) -> Double){
     val medidaFinal = String.format("%.2f", formulaConversion(medidaInicial))
     println("$medidaInicial grados $escalaInicial son $medidaFinal grados $escalaFinal")
}


fun parametros(nombre: String, apellido: String, edad: Int) {
  println("Mi nombre es $nombre $apellido y tengo $edad años")
}


fun Mes(mes: Int){
  when (mes){
  in 1..4-> {
    println("1º Cuatrimestre")
    println("Enero")
    println("Febrero")
    println("Marzo")
    println("Abril")
   }

  in 5..8->{
    println("2º Cuatrimestre")
    println("Mayo")
    println("Junio")
    println("Julio")
    println("Agosto")
   }

   in 9..12->{
    println("3º Cuatrimestre")
    println("Septiembre")
    println("Octube")
    println("Noviembre")
    println("Diciembre")
   }
    else->{
       print("No es correcto")
    }
  }
 }


fun arrays(){
    val semana = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(semana[0])
    println(semana.get(1))
    println(semana.size)
    println(semana.get(semana.size - 1)) //Obtenemos el ultimo elemento del array
    print(semana.set(0, "Monday"))
    println(semana[0])
    val arrayNumeros = (0..20)
    val arrayAbecedario = ("a".."z")

    for (indice in semana.indices){
        println(semana.get(indice))
    }

    for ((posicion, valor) in semana.withIndex()){
        println("La posicion $posicion contiene el valor $valor")
    }

    for (dia in semana){
        println(semana)
    }
}

fun listas(){
    //Listas inmutables == Arrays
    val diasSemana: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(diasSemana.size)
    println(diasSemana.get(3))
    println(diasSemana.first())
    println(diasSemana.last())
    //Listas mutables
    val diasSemanaMutables: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    val FinSemana = listOf ("Sabado", "Domingo")
    println(diasSemanaMutables)
    diasSemanaMutables.addAll(FinSemana)
    println(diasSemanaMutables)
    println(diasSemanaMutables.none())  //Indica si la lista esta vacia
    println(diasSemanaMutables.firstOrNull())
    println(diasSemanaMutables.elementAtOrNull(2))
    println(diasSemanaMutables.lastOrNull())
    val resultado = diasSemanaMutables.filter{
        //it == "Lunes"  && it !="Jueves"
        it.startsWith("M")
    }
    println(resultado)
    for (item in diasSemanaMutables){
        println(item)
    }
    for ((posicion, item) in diasSemanaMutables.withIndex()){
        println("La posicion $posicion contiene $item")
    }
    val nuevaLista: MutableList<String> = mutableListOf()
    diasSemanaMutables.forEach{
        nuevaLista.add(it+" Mutante")
    }
    println(nuevaLista)
}

fun mapas(){
   val mapa = mapOf(1 to "Manzana", 2 to "Pera")
   val mapaVacio = mapOf<Int, String>()
   val mapaMutable = mutableMapOf(1 to "Manzana", 2 to "Pera")
   val mapaMutableVacio = mutableMapOf<String, String>()
   println(mapa.entries)
   println(mapa.keys)
   println(mapa.values)
   println(mapa.size)
   println(mapa.count())
   println(mapa[1])
   println(mapa.getValue(1))
   println(mapa.getOrDefault(3, "No existe"))
   if (mapa.containsKey(3)){
       println("Existe la clave")
   } else{
       println("No existe la clave")
   }
   if(mapa.containsValue("Pera")) println("Hay Pera!!")
   mapaMutable.clear() //Elimina los elementos del mapa
    val mapaFrutasTropicales = mutableMapOf(3 to "Mango", 4 to "Granada")
    println(mapaMutable.put(4, "Platano"))
    println(mapaMutable)
    println(mapaMutable.putAll(mapaFrutasTropicales))
    println(mapaMutable)
}

fun buclesFor(){
 for (x in 0..10) {
     println(x)
 }
  for (x in 0 until 10){
      println(x)
  }
  for (x in 0..10 step 2){
      println(x)
  }
    for (x in 10 downTo 0 step 3){
        println(x)
    }
}

fun bucleWhile(){
    var x = 0
    while(x < 10){
       println(x)
       x++
    }
}

fun nullSafety(){
   var stringNullSafety: String? = "Prueba"
    println(stringNullSafety?.length)
    stringNullSafety = null
    println(stringNullSafety?.length)

    stringNullSafety = "Ahora con texto"
    stringNullSafety?.let { //Se ejecuta cuando no sea nulo
        println(it)
    } ?: run { //se ejecuta cuando es nulo
        println("Variable nula")
     }
}


fun Notificaciones(noti: Int): String{

    if (noti<100) {
            println("Tienes"+noti+"notificaciones")
    }
    else{
            println("Tu teléfono esta explotando. Tienes 99+ notificaciones")
    }
    return TODO("Provide the return value")
}

fun entradas(edad: Int, esLunes: Boolean): Float{
     return when(edad){
         in 0..12 -> 5.4f
         in 13..60 -> if (esLunes) 6.7f else 8.5f
         in 61..100 -> 5f
         else -> 1f
     }
}


fun Temperatura(medidaInicial:  Double, escalaInicial: String){
    var medidaFinal : Double = when(escalaInicial){
        "Celsius" -> 9.0/5.0 * medidaInicial + 32
        "Kelvin" ->  medidaInicial - 273.15
        else -> 5.0/9.0 * (medidaInicial -32) + 273.15
    }
      var medidaFinalString = String.format("%.2f", medidaFinal)
      println("$medidaFinal grados $escalaInicial son $medidaFinalString grados")
}


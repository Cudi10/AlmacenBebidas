open class Bebidas(val id: Int, val cantidadLitros: Double, val precio: Double, val marca: String){
    open fun calcularPrecio(): Double {
        return precio * cantidadLitros
    }

    open fun mostrar() {
        println("ID: $id, Marca: $marca, Litros: $cantidadLitros, Precio por litro: $precio")
    }
}
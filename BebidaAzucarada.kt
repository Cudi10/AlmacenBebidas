class BebidaAzucarada(id: Int, cantidadLitros: Double, precio: Double, marca: String,
   val porcentajeAzucar: Double, val tienePromocion: Boolean) : Bebidas(id, cantidadLitros, precio, marca){

    override fun calcularPrecio(): Double {
        var precioFinal = super.calcularPrecio()
        if (tienePromocion) {
            precioFinal *= 0.9  // Aplicar un descuento del 10%
        }
        return precioFinal
    }

    override fun mostrar() {
        super.mostrar()
        println("Azúcar: $porcentajeAzucar%, Promoción: ${if (tienePromocion) "Sí" else "No"}")
    }
}
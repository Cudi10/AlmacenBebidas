class AguaMineral (id: Int, cantidadLitros: Double, precio: Double, marca: String, val origen: String):
    Bebidas(id, cantidadLitros, precio, marca) {

    override fun mostrar() {
        super.mostrar()
        println("Origen: $origen")
    }

}
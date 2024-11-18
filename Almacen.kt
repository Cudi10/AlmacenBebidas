class Almacen {

    private val estanteria: Array<Array<Bebidas?>> = Array(5) { Array(5) { null } }
    private val bebidas: MutableMap<Int, Bebidas> = mutableMapOf()  // Para asegurarnos de que no haya duplicados de ID

    // Agregar bebida al almacén
    fun agregarBebida(bebida: Bebidas, fila: Int, columna: Int) {
        if (bebidas.containsKey(bebida.id)) {
            println("No se puede agregar la bebida. El ID ${bebida.id} ya está en uso.")
            return
        }
        if (fila in 0..4 && columna in 0..4) {
            estanteria[fila][columna] = bebida
            bebidas[bebida.id] = bebida
            println("Bebida agregada correctamente.")
        } else {
            println("Posición inválida en la estantería.")
        }
    }

    // Eliminar bebidas del almacén
    fun eliminarBebida(id: Int) {
        val bebida = bebidas[id]
        if (bebida != null) {
            bebidas.remove(id)
            // Buscar y eliminar en la matriz
            for (i in 0..4) {
                for (j in 0..4) {
                    if (estanteria[i][j]?.id == id) {
                        estanteria[i][j] = null
                        println("Bebida con ID $id eliminada.")
                        return
                    }
                }
            }
        } else {
            println("No se encontró la bebida con ID $id.")
        }
    }

    // Mostrar la bebida en la posición específica
    fun mostrarBebida(id: Int) {
        val bebida = bebidas[id]
        if (bebida != null) {
            bebida.mostrar()
        } else {
            println("No se encontró la bebida con ID $id.")
        }
    }

    // Calcular el precio total de todas las bebidas
    fun calcularPrecio(): Double {
        return bebidas.values.sumOf { it.calcularPrecio() }
    }

    // Calcular el precio total de todas las bebidas de una marca
    fun calcularPrecioMarca(marca: String): Double {
        return bebidas.values.filter { it.marca == marca }.sumOf { it.calcularPrecio() }
    }

    // Calcular el precio total de una columna específica
    fun calcularPrecioColumna(columna: Int): Double {
        if (columna !in 0..4) {
            println("Columna inválida.")
            return 0.0
        }
        return estanteria.sumOf { it[columna]?.calcularPrecio() ?: 0.0 }
    }

    // Mostrar todas las bebidas en la estantería
    fun mostrarEstanteria() {
        for (i in 0..4) {
            for (j in 0..4) {
                val bebida = estanteria[i][j]
                if (bebida != null) {
                    println("Posición [$i][$j]:")
                    bebida.mostrar()
                }
            }
        }
    }

}
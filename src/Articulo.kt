package src

open class Articulo(var nombre: String, var precio: Double) {

    companion object {
        private var id: Int = 0
    }

    fun generarID(totalArticulos: Int): Int{
        id = totalArticulos + 1
        println("ID actualizado.")
        return totalArticulos + 1
    }

    open fun promocionNavidad(porcentaje: Int){
        if (precio >= 500){
            precio = precio * porcentaje / 100
            println("Precio rebajado.")
        } else {
            println("El precio no supera los 500€, no se le aplicará rebaja al producto ($nombre).")
        }
    }

    override fun toString(): String {
        return "$nombre - ${"%.2f".format(precio)}€ (ID: $id)"
    }
}
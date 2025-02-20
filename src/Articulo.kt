package src

class Articulo(var nombre: String, var precio: Double) {

    companion object {
        private var id: Int = 0
    }

    fun generarID(totalArticulos: Int): Int{
        id = totalArticulos + 1
        println("ID actualizado.")
        return totalArticulos + 1
    }

    fun promocionNavidad(porcentaje: Int){
        precio = precio * porcentaje / 100
        println("Precio rebajado.")
    }

    override fun toString(): String {
        return "$nombre - ${"%.2f".format(precio)}€ (ID: $id)"
    }
}
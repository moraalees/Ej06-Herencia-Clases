package src

fun main(){
    val guantes = Articulo("Guantes de boxeo", 25.00)
    val tabla = Articulo("Tabla de surf", 45.00)

    var total = 0

    val ordenadorGam = Ordenador("PC DELUXE", 1299.99, TipoOrdenador.GAMING)
    val ordenadorBas = Ordenador("Lenovo 66", 399.99)

    val articulos = listOf(guantes, tabla, ordenadorGam, ordenadorBas)

    for (articulo in articulos){
        total = articulo.generarID(total)
        articulo.promocionNavidad(33)
        println(articulo)
    }
}
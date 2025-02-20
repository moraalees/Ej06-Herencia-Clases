package src

class Ordenador(
    nombre: String,
    precio: Double,
    val tipo: TipoOrdenador = TipoOrdenador.BASICO
): Articulo(nombre, precio) {

}
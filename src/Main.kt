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

//¿De qué tipo genera en la lista por defecto el compilador?
//La lista se genera por defecto de tipo Articulo, ya que en su contenido aparecen por mayoría absoluta objetos de tipo Articulo.

//¿Qué está ocurriendo en este ejemplo con respecto a lo que hemos visto del polimorfismo de la herencia?
//La lista contiene instancias de Articulo y Ordenador, y cuando se usa el metodo promocionNavidad(), se ejecutará la versión correspondiente a la clase real del objeto.

//¿Qué pasaría si creáramos la lista con listOf<Ordenador>? ¿Y si la hiciéramos con listOf<Any>?
//Si se crea de tipo Ordenador, esta no se pueden incluir otros objetos que no sean de este tipo, incluyendo Articulo.
//Sobre tipo Any, la lista aceptaría cualquier objeto, ya sea una clase de cualquier tipo, o una variable Int, String, etc.

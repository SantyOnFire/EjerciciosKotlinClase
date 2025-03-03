import kotlin.random.Random

fun main() {
    print("INTRODUZCA LA  CANTIDAD DE DINERO PARA INICIAR: ")
    var dinero = readLine()?.toDoubleOrNull() ?: return
    var jugando = true

    while (jugando && dinero > 0) {
        val numero = Random.nextInt(1, 4) // Genera un número aleatorio entre 1 y 3
        println("Número obtenido: $numero")

        when (numero) {
            3 -> {
                println("¡Perdio todo su dinero!")
                dinero = 0.0
                jugando = false
            }
            2 -> {
                dinero /= 2
                println("Perdio la mitad de su dinero: ahora tiene: $dinero")
            }
            1 -> {
                dinero *= 2
                println("¡Duplico la cantidad de dinero que tenia: $dinero")
            }
        }

        if (dinero > 0) {
            print("¿Quiere seguir jugando? (si/no): ")
            val respuesta = readLine()
            if (respuesta?.lowercase() != "s") {
                jugando = false
            }
        }
    }
    println("El Juego terminado. Dinero final: $dinero")
}
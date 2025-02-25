import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Declaración de variables para contar monedas de diferentes denominaciones
    var count20 = 0
    var count50 = 0
    var count100 = 0
    var count200 = 0
    var count500 = 0
    var opcion: Int

    // Menú principal en bucle hasta que el usuario elija salir
    while (true) {
        println("\nMenú:")
        println("1. Agregar moneda")
        println("2. Contar monedas")
        println("3. Calcular total")
        println("4. Romper alcancía y salir")
        print("Seleccione una opción: ")

        // Verificación para evitar errores si el usuario ingresa algo que no es un número
        if (!scanner.hasNextInt()) {
            println("Por favor, ingrese un número válido.")
            scanner.next() // Limpiar entrada incorrecta
            continue
        }
        opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                // Solicitar denominación de moneda al usuario
                print("Ingrese la denominación (20, 50, 100, 200, 500): ")

                if (!scanner.hasNextInt()) {
                    println("Por favor, ingrese un número válido.")
                    scanner.next() // Limpiar entrada incorrecta
                    continue
                }
                val moneda = scanner.nextInt()

                // Incrementar el contador correspondiente según la denominación
                when (moneda) {
                    20 -> count20++
                    50 -> count50++
                    100 -> count100++
                    200 -> count200++
                    500 -> count500++
                    else -> println("Denominación no válida.")
                }
            }

            2 -> {
                // Mostrar la cantidad de cada tipo de moneda guardada
                println("Monedas de 20: $count20")
                println("Monedas de 50: $count50")
                println("Monedas de 100: $count100")
                println("Monedas de 200: $count200")
                println("Monedas de 500: $count500")
            }

            3 -> {
                // Calcular y mostrar el total ahorrado
                val total = (count20 * 20) + (count50 * 50) + (count100 * 100) + (count200 * 200) + (count500 * 500)
                println("Total ahorrado: $$total")
            }

            4 -> {
                // Romper la alcancía, mostrar el total y salir del bucle
                val total = (count20 * 20) + (count50 * 50) + (count100 * 100) + (count200 * 200) + (count500 * 500)
                println("Rompiste la alcancía. Total retirado: $$total")
                break
            }

            else -> println("Opción no válida. Intente de nuevo.")
        }
    }

    // Y ya Cerramos el escáner para evitar fugas de memoria
    scanner.close()
}
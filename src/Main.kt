fun main() {
    //Declaramos las 3 Variables para el sistema de control de acceso
    var intentos = 0
    val intentosMaximos = 3
    var codigo = 0

    println("==== SISTEMA DE CONTROL DE ACCESO ====")

    // El Bucle que se ejecuta mientras no se superen los intentos máximos
    while (intentos < intentosMaximos) {
        println("\nPor favor ingresa tu código:")

        // Leemos lo que escribe el usuario
        val textoIngresado = readLine()

        // Comprobamos si es un número
        try {
            codigo = textoIngresado?.toInt() ?: 0
        } catch (e: Exception) {
            println("Error: Tienes que escribir un número.")
            continue
        }

        // Verificamos qué tipo de persona es según su código
        if (codigo >= 1000 && codigo <= 1999) {
            // Si es trabajador de la empresa
            println("\n¡Hola Empleado número $codigo!")
            println("Puedes pasar :)")
            break

        } else if (codigo >= 2000 && codigo <= 2999) {
            // Si es una visita
            println("\nEres visitante. Necesitamos más datos:")

            println("¿Cómo te llamas?")
            val nombreVisitante = readLine() ?: ""

            println("¿Para qué vienes hoy?")
            val razonVisita = readLine() ?: ""

            println("\n=== DATOS DEL VISITANTE ===")
            println("Número: $codigo")
            println("Nombre: $nombreVisitante")
            println("Razón: $razonVisita")
            println("========================")
            println("\n¡Bienvenido $nombreVisitante!")
            println("Puedes pasar :)")
            break

        } else {
            // Si el código no es válido
            intentos++
            val intentosQueFaltan = intentosMaximos - intentos

            if (intentosQueFaltan > 0) {
                println("Código equivocado. Te quedan $intentosQueFaltan intentos.")
            } else {
                println("\n¡ALERTA! DEMASIADOS INTENTOS")
                println("Sistema bloqueado. Llama al guardia de seguridad.")
            }
        }
    }
}
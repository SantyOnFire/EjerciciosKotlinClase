fun main() {
    // Variables para contar los votos de cada candidato
    var votosAInternet = 0
    var votosARadio = 0
    var votosATelevision = 0

    var votosBInternet = 0
    var votosBRadio = 0
    var votosBTelevision = 0

    var votosCInternet = 0
    var votosCRadio = 0
    var votosCTelevision = 0

    // Variable para el total de votos
    var totalVotos = 0
    // Simulación de votos
    println("Votando...")

    // Voto 1 internet
    votosAInternet++
    totalVotos++

    // Voto 2 Rd
    votosBRadio++
    totalVotos++

    // Voto 3 TV
    votosCTelevision++
    totalVotos++

    println("\nResultados de la elección:")
    println("Candidato A:")
    println("  Votos por Internet: $votosAInternet")
    println("  Votos por Radio: $votosARadio")
    println("  Votos por Televisión: $votosATelevision")
    println("  Total de votos: ${votosAInternet + votosARadio + votosATelevision}")
    println("  Costo de campaña: $${(votosAInternet * 700000) + (votosARadio * 200000) + (votosATelevision * 600000)}")

    println("Candidato B:")
    println("  Votos por Internet: $votosBInternet")
    println("  Votos por Radio: $votosBRadio")
    println("  Votos por Televisión: $votosBTelevision")
    println("  Total de votos: ${votosBInternet + votosBRadio + votosBTelevision}")
    println("  Costo de campaña: $${(votosBInternet * 700000) + (votosBRadio * 200000) + (votosBTelevision * 600000)}")

    println("Candidato C:")
    println("  Votos por Internet: $votosCInternet")
    println("  Votos por Radio: $votosCRadio")
    println("  Votos por Televisión: $votosCTelevision")
    println("  Total de votos: ${votosCInternet + votosCRadio + votosCTelevision}")
    println("  Costo de campaña: $${(votosCInternet * 700000) + (votosCRadio * 200000) + (votosCTelevision * 600000)}")

    println("\nTotal de votos en la elección: $totalVotos")
}

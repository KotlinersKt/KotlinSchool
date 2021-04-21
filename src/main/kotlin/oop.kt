class KFile(
    var fileName: String,
    var extension: String = "txt",
    val password: String = "password123",
) {
    var name: String = fileName



    fun getTotalBytes(): Int {
        println(fileName)
        return 0
    }
}

fun main() {
    val chubyHomework = KFile("homework_final", password = "masseguro.com")

    chubyHomework.fileName = "sier_homework"

    val gorroAudio = KFile("gorro")
    val sierSecrets = KFile(
        "secrets",
        "jks"
    )
    println(chubyHomework.extension)
    println(chubyHomework.fileName)
    println(chubyHomework.password)
    println(sierSecrets.password)

}

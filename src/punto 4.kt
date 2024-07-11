fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val hobbyDescription = hobby?.let { "Likes to $it." } ?: "No hobby specified."
        val referrerDescription = referrer?.let { "Has a referrer named ${it.name}, who likes to ${it.hobby}." }
            ?: "Doesn't have a referrer."
        println("Name: $name")
        println("Age: $age")
        println("$hobbyDescription $referrerDescription")
    }
}
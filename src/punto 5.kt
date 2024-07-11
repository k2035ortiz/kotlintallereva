open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkScreenLightStatus() {
        val status = if (isScreenLightOn) "on" else "off"
        println("The phone screen light is $status.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = false) : Phone(isScreenLightOn) {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
            println("The phone is on.")
        } else {
            println("Cannot turn on the screen while the phone is folded.")
        }
    }

    fun fold() {
        isFolded = true
        println("The phone is folded.")
    }

    fun unfold() {
        isFolded = false
        println("The phone is unfolded.")
    }

    fun checkPhoneStatus() {
        val status = if (isFolded) "folded" else "unfolded"
        println("The phone is $status.")
    }
}

fun main() {
    val foldablePhone = FoldablePhone()

    foldablePhone.switchOn()
    foldablePhone.checkScreenLightStatus()

    foldablePhone.fold()
    foldablePhone.checkPhoneStatus()

    foldablePhone.switchOn()
    foldablePhone.checkScreenLightStatus()

    foldablePhone.unfold()
    foldablePhone.checkPhoneStatus()

    foldablePhone.switchOn()
    foldablePhone.checkScreenLightStatus()

    foldablePhone.switchOff()
    foldablePhone.checkScreenLightStatus()
}
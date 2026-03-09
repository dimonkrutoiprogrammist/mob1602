fun printPersonInfo(name: String, age: Int = 18, city: String = "Неизвестно"){
    println("Имя: $name, Возраст: $age, Город: $city")
}

fun main(){
    printPersonInfo("Димон", 17, "Чита")
    printPersonInfo("Димон", 17)
    printPersonInfo("Димон")

}

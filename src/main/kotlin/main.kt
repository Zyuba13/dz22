fun main(){
    val likes = 271
    val ending = if (likes % 10 == 1 && likes % 100 !== 11) "человеку" else "людям"
    println("Понравилось $likes $ending")
}
// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }
// TEM MUITO A EVOLUIR AINDA, E JUNTO COM ISSO VOU EVOLUIR ESSE CODIGO. 
class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
         
    }
}

fun main() {
    val inscritos1 = "Nome do aluno: Ivan, e sua formação: Kotlin!"
        println("$inscritos1")
   	val inscritos2 = "Nome do aluno: Pedro, e sua formação: Kotlin!"
        println("$inscritos2")
    val inscritos3 = "Nome do aluno: Paulo, e sua formação: Kotlin!"
        println("$inscritos3")
}

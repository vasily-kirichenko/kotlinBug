import kotlinx.coroutines.withTimeout

fun getFunc(x: Int) = 1

suspend fun main() {
    listOf(1 to 2).map { (_, x) ->
        withTimeout(1) {
            getFunc(x)
        }
    }
}
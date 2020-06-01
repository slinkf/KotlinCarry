fun main() {
    runTakeIf()
    runTakeUnless()
}

fun runThis() {
    // map filter let
    val hashMap = mutableListOf("123", "1233", "12334", "123124")
    hashMap.map { it.length }.filter { it > 3 }.let(::print)
}

/**
 * with 使用 尽量使用 传参的形式 而不是lambda表达式的形式
 */
fun runWith() {
    val name = "lidikun"
    print(with(name) {
        return@with "my name is $this" +
                "first char is ${first()}" +
                "last char is ${last()}"
    })
}

/**
 * 将对象作为this 引用
 * 返回值是对象本身
 */
fun runApply() {
    "lidikun".apply {

    }.apply {

    }.apply {

    }
}

/**
 * 将对象作为it 引用
 * 返回值是it
 */
fun runAlso() {
    "lidikun".also {

    }.also {

    }
}

/**
 * 将对象作为this  引用
 * 返回值 lambda表达式结果
 */
fun runRun() {
    var str = "lidikun".run {
        return@run 3
    }
}

/**
 * 将对象作为it引用
 * 返回值 lambda表达式结果
 */
fun runLet() {
    var str = "lidikun".let {

        return@let 2
    }
}


/**
 * 验证通过 返回对象
 * 验证不通过 返回null
 */
fun runTakeIf(){
    val takeIf = "lidikun".takeIf {
        it.length == 7
    }
    print("$takeIf")
}

/**
 * 验证通过返回null
 * 验证不通过返回对象
 */
fun runTakeUnless(){
    val str = "lidikun".takeUnless {
        it.length == 7
    }
    print("$str")
}
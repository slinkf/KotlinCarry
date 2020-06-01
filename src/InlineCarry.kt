class InlineCarry {
    //inline  局部方法
    //crossinline 禁止非局部返回
    inline fun method(crossinline a:(body:String?)->Boolean):Boolean = a.invoke("")
     fun method2( a:(body:String?)->Boolean):Boolean = a.invoke("")



}
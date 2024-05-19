package Lecture1

fun main() {
    var number1 = 10L // mutable
    // var number1: Long = 10L (OK)
    // var number1: Long (OK)
    // var number1 (NO)
    val number2 = 10L // immutable
    // val -> ArrayList 사용 시 데이터 추가는 당연히 가능

    // tip
    // 우선 val(불변) -> 변동하는 값을 var로 변경

    var number3 = 1_000L
    // 숫자, Boolean, 문자에서는 primitive type 사용하도록 컴파일러에서 지원

    // nullable variable
    var number4: Long?

    // Class -> Instance 선언
    // new 키워드 사용 안함
    // var person = Person("name")
}
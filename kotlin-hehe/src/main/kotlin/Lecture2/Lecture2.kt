package Lecture2

import common.Person

fun main() {
    val str: String? = "ABC"

//    // safe call (null이면 실행 X, 아니면 실행)
//    str.length // safe call 없이 불가능
//    str?.length // safe call 후 가능
//    // null이면 전체가 null이 됨

    // Elvis 연산자
    str?.length ?: 0 // 앞의 연산결과가 null이면 뒤의 값을 사용
    // TS에서 let a = test?.length || 0 으로 선언하는 것과 동일

    val person = Person("test1")
    // name is nullable, so error occurred
    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

// Java to Kotlin 변환
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null")
    }

    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }

    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }

    return str.startsWith("A")
}

fun startsWithAKot1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null")
}

fun startsWithAKot2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithAKot3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// early return with null
fun earlyReturn(number: Long?): Long {
    // early return
    // = if (number == null) { return 0 }
    number ?: return 0
    // next logic
    return number + 10L
}

// 절대 null이 아님을 단언
// null이 들어오면 NPE 발생
fun startsWithNotNull(str: String?): Boolean {
    return str!!.startsWith("A")
}
package theory.`5_Types`

/*

"Типы данных"

В отличии от Java (где есть примитивные тип и ссылочные) - в Kotlin нет примитивных типов данных, все типы - объектные (ссылочные).
Поэтому вместо int или Integer используется единый тип Int, который сразу является объектом.

Самые базовые типы:

String - текст
Long/Int/Short/Byte - целое число
Double/Float - нецелое число
Char - 1 символ
Boolean - true/false

Коллекции, классы и другие комплексные типы будут рассматриваться в след. уроках


Типы данных:
https://kotlinlang.org/docs/reference/basic-types.html


 */


// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

    var digit1 = 10
    var digit2 = 6
    var digit3 = 1_234_234 // для удобства чтения большого числа

    // легкая конвертация из одного типа в другой
    var text1 = digit1.toString() // нажмите над переменной "Alt + колесо мыши" и увидите тип String, который был присвоен автоматически


    var unsignedInt1 = 10u // u означает unsigned (беззнаковый) - может хранить только положительные числа
    var unsignedInt2:UInt = 10u // аналогичная запись


    var result = 10/6

    println(result) // деление целых чисел возвращает ЦЕЛОЕ число (кол-во вхождений числа 6 в 10)

    println(10/6.toDouble()) // возвращает нецелое число, т.к. вручную изменили тип одного числа на Double


    // println - сокращенная запись System.out.println


}



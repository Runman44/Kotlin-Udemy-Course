package chapter_10

// DRY - don't repeat yourself

open class Stack<T> (vararg items : T) {

    val elements = items.toMutableList()

    fun push(element : T) {
        elements.add(element)
    }

    fun pop() : T? {
        if (elements.isNotEmpty()) {
            return elements.removeAt(elements.size -1)
        }
        return null
    }
}

fun <T> stackOf(vararg elements : T) : Stack<T> {
    return Stack(*elements)
}

fun main(args: Array<String>) {
    val stack = Stack(1,2,3,4)

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    stack.push(11)

    val nameStack = Stack("Yolo", "Sup")
    println(nameStack.pop())
    nameStack.push("Yeah")

    val doubles = stackOf(3.9, 3.2, 3.6)
    println(doubles.pop())
    println(doubles.pop())
    println(doubles.pop())
}
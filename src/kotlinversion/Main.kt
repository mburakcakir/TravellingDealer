package kotlinversion


fun main() {

    val factory = Node(3, 7)
    val node = Node(1, 4)
    node.appendToEnd(1, 10)
    node.appendToEnd(2, 1)
    node.appendToEnd(5, 2)
    node.appendToEnd(6, 5)
    node.appendToEnd(8, 4)
    node.appendToEnd(8, 9)
    node.appendToEnd(9, 2)

    // set factory
    node.setFactory(factory)

    // print nodes by x and y
    println("Nodes:")
    node.printNodes()

    // distance between nodes based on factory and total sum
    println("\nNode lengths:")
    val sumOfNodes = node.sumOfNodes()
    println("\nSum of nodes:$sumOfNodes")

    // obtain length of nodes count
    println("\nNode length:" + node.length())

    // delete node based on x and y coordinates
    node.deleteNode(5, 2)

    // after delete, print nodes again
    println("\nAfter deleted node (5,2)")
    node.printNodes()


}

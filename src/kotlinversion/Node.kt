package kotlinversion

import kotlin.math.sqrt

class Node(private var x: Int, private var y: Int) {

    private var following: Node? = null
    private lateinit var factory: Node

    fun setFactory(node: Node) {
        factory = node
    }

    fun appendToEnd(x: Int, y: Int) {
        val end = Node(x, y)
        var node: Node? = this
        while (node!!.following != null) {
            node = node.following
        }
        node.following = end
    }

    //
    //    // TODO:: Implement to return the length of the SinglyLinkedList
    //    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var node: Node? = this
        while (node != null) {
            println(node.x.toString() + " " + node.y.toString())
            node = node.following
        }
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(): Int {
        var counter = 0
        var node: Node? = this
        while (node != null) {
            counter += 1
            node = node.following
        }

        return counter
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Double {
        var totalDistance = 0.0
        var node: Node? = this
        while (node != null) {
            print("nodes: (${factory.x}, ${factory.y}) ->  (${node.x}, ${node.y}):  ")
            val distance = sqrt((((node.x - factory.x) * (node.x - factory.x) + (node.y - factory.y) * (node.y - factory.y)).toDouble()))
            totalDistance += distance
            node = node.following
            println(distance)
        }

        return totalDistance
    }

    fun deleteNode(x: Int, y: Int): Node {
        var node: Node? = this
        var previousNode: Node? = null

        while (node != null && (node.x == x).not() && (node.y == y).not()) {
            previousNode = node
            node = node.following
        }

        if (node == null)
            println("Error to delete node.")

        previousNode!!.following = node!!.following

        return node
    }
}
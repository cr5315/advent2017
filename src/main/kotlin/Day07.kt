import kotlin.math.absoluteValue

object Day07 {

    data class Node(val name: String, private val weight: Int, val children: MutableList<Node> = mutableListOf(),
                    var parent: Node? = null) {
        private val totalWeight: Int by lazy {
            weight + children.sumBy { it.totalWeight }
        }

        private val childrenAreBalanced: Boolean by lazy {
            children.map { it.totalWeight }.distinct().size == 1
        }

        fun findImbalance(imbalance: Int? = null): Int =
                if (imbalance != null && childrenAreBalanced) {
                    weight - imbalance
                } else {
                    val subtreeWeights = children.groupBy { it.totalWeight }
                    val unbalancedTree = subtreeWeights.minBy { it.value.size }?.value?.first()
                        ?: throw IllegalStateException("Should not be balanced here.")
                    unbalancedTree.findImbalance(imbalance ?: subtreeWeights.keys.reduce{ a,b -> a - b}.absoluteValue)
                }
    }

    fun partOne(input: String): String {
        return findHeadOfTree(input).name
    }

    fun partTwo(input: String): Int {
        return findHeadOfTree(input).findImbalance()
    }

    private fun findHeadOfTree(input: String): Node {
        val names = mutableMapOf<String, Node>()
        val parentChildPairs = mutableSetOf<Pair<Node, String>>()
        val rowRegex = """\w+""".toRegex()

        input.lines().forEach {
            val groups = rowRegex.findAll(it).toList().map { it.value }
            val node = Node(groups[0], groups[1].toInt())
            names.put(node.name, node)

            groups.drop(2).forEach {
                parentChildPairs.add(Pair(node, it))
            }
        }

        parentChildPairs.forEach{ (parent, childName) ->
            with(names.getValue(childName)) {
                parent.children.add(this)
                this.parent = parent
            }
        }

        return names.values.firstOrNull { it.parent == null } ?: throw IllegalStateException("No head node?")
    }
}
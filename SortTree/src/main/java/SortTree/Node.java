package SortTree;

public class Node implements Comparable<Node> {
    public Node left;
    public Node right;
    public int value;

    public Node(Node l, Node r, int v) {
        left = l;
        right = r;
        value = v;
    }

    public int compareTo(Node o) {
        return value - o.value;
    }
}
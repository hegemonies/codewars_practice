package SortTree;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kata {
    static Queue<Node> q = new PriorityQueue<Node>();
    static List<Integer> l = new ArrayList<Integer>();

    public static List<Integer> treeByLevels(Node node) {
        if (node != null) {
            q.add(node);

            while (!q.isEmpty()) {
                Node tmp = q.poll();
                l.add(tmp.value);
                if (tmp.left != null) {
                    q.add(tmp.left);
                }
                if (tmp.right != null) {
                    q.add(tmp.right);
                }
            }
        }

        System.out.println(l);

        return l;
    }
}
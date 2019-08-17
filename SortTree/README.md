# Sort binary tree by levels
###### 4 kyu

You are given a binary tree:
```java
public class SortTree.Node {
  public SortTree.Node left;
  public SortTree.Node right;
  public int value;

  public SortTree.Node(SortTree.Node l, SortTree.Node r, int v) {
    left = l;
    right = r;
    value = v;
  }
}
```
Your task is to return the list with elements from tree sorted by levels, which means the root element goes first, then root children (from left to right) are second and third, and so on.

Return empty list is root is 'null'.

Example 1 - following tree:

                 2
            8        9
          1  3     4   5
Should return following list:

[2,8,9,1,3,4,5]

Example 2 - following tree:

                 1
            8        4
              3        5
                         7
Should return following list:

[1,8,4,3,5,7]

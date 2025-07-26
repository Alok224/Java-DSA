<!-- Approach -->

1. Traverse the whole tree until don't reach to the leaf node.

2. if root.left == null and root.right == null then print the list of the root nodes.
   {We can Use the linkedlist or Arratlist}

3. Add the root in the linkedlist or arraylist.

4. call the recursive function to move the left subtree and right subtree when until don't reach to the leaf node.

5. remove the last root node from the linkdlist or arraylist.

Time complexity :- O(H).
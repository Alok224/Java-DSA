<!-- Inorder traversal -->
(root node is in middle)

1. Firstly traverse through the left subtree until the left root node is not null.
2. Then print the root node.
3. Then traverse through the right until root node is not null.

Time complexity:- O(n).

<!-- preorder traversal -->

1. firstly print the root node.
2. then traverse through the left subtree until the left root node is not null.
3. Then traverse through the right until root node is not null.

Time complexity:- O(n).

<!-- Postorder traversal -->
(root is in last)

1. Firstly traverse through the left subtree until the left root node is not null.
3. Then traverse through the right until root node is not null.
3. then print the root node.

Time complexity:- O(n).

<!-- Level order traversal -->
(Based on BFS)

Thought Process
1. Solving by Queue(FIFO).
2. Using collection framework, add the Nodes in queue.
3. After print the element, just remove the element from the queue
4. Check the null, and print the nextline and thenafter add the null value to queue.

Time complexity :- O(n).

<!-- Problem:- Count of nodes -->

Thought process
Just use the recursion
1. traverse through left subtree until it is not null.
2. traverse through right subtree untill it is not null.
3. return the count as 1 for all nodes.

Time complexity:- O(n).

<!-- Problem:- Sum of nodes -->

Thought process
Just use the recursion
1. traverse through left subtree until it is not null.
2. traverse through right subtree untill it is not null.
3. return the root.data for all nodes(so that it store the current data of the node).

Time complexity:- O(n).


<!-- Problem:- Height Of tree -->

Thought process
Just use the recursion
1. traverse through left subtree until it is not null.
2. traverse through right subtree untill it is not null.
3. return the maxheight of left subtree and the right subtree and add 1 for root node data.

Time complexity:- O(n).

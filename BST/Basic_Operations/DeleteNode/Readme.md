To delete the node

1. first is to search the value to delete that.

2. when root.data == searching value, then apply the delete conditions

3. to delete that node, there are 3 cases.
   1. to delete leaf node, it means there is not any child node.
   2. Or there is only one child node(left or right).
   3. there is two child node.

4. So, for first case make the root null.

5. for 2nd case, if the right node exist and left node is null then return root.right and vice versa.

6. for 3rd case, follow the inordersuccessor approach.
    1. find the most smallest node in the right subtree.

Remind this point:- In inorder, roots are always in sorted order.
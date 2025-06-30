Thought Process

ReverseIterate :- How to Reverse a linked list?
Thought Process:-
1. Take these variables 
currentnode, previousnode, nextnode
2. While Traversing current.next = previous

Time Complexity:- O(n)
Space complexity :- O(1)


Problem3 :- Find the nth node from the last
Thought Process
1. Measure the distance of nth node from the last is nth 
2. And the distance of nth node from the start is size -n + 1 and for previous that would be size -n.
3. So, to delete the nth node just traverse from the start and find the previous node and create connection to the previousnode.next.next
4. If nth == size it means we are on last node and want to delete. So just do head.next.

Time Complexity:- O(n) + O(n) = O(2n) → Simplified to O(n).
Space Complexity: O(1).


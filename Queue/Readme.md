<!-- For Queue (Implementation with linked list) -->

1. Take Two pointers head and tail
and for add the element tail.next = newnode and tail = newnode
(With one condition if tail is null(It means only one Node) Then tail = head = newnode)

2. To delete the Node from the first just head = head.next.

time complexity :- O(1)

In queue, Always remove the element from the head and add the element from the last.

<!-- Collection framework Implementation -->

1. Queue<Integer> q = new LinkedList<>();

** Queue is not a class. It is a Interface(Interface doesn't have any objects)
2. Queue Interface Implements LinkedList and ArrayDeque.
(With the help of these two we can add, delete and peek the element)
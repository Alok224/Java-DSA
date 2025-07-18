<!-- Approach -->

Combination Sum

1. find all the possible subset but in this one element from the list is taken multiple times.

2. when the base case is reached means the target is less than 0 or index == array.length then return and when the target == 0
   then add the subset in the list.

Time Complexity :- O(2^n * k).
k is the target sum.
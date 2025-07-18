<!-- Approach -->

Count all the subsequences with sum k

1. find all the possible subset (Add the element or not adding the element).

2. if base case is reached means index == array.length then calculate the sum for that and if that
   Sum is equal to target value means k..Then add that element in the list.

Time complexity :-  O(2 ^ n). O(k)
{k is the target sum}.
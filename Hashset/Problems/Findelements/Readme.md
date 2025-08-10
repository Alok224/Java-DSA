Given an Integer of array of size n, find all elements that appear more than n/3 times.

<!-- Approach -->

1. Using Hashmap data structure and store the all integers with the value which contains the frequency of the integer.

2. Check that the key(Mean that integer) store in the map or not?

3. If the key is exist then update the frequency (Add 1).  Otherwise add the key and value in the map.

4. To get the key value that appear more than n\3 times just traverse entire map and print that key.

Time complexity :- O(n).
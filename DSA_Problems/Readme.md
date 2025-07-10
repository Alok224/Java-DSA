Thought Process

Problem4 :- Check the linked list is palindrome or not?
(Condition:- Don't take any extra space)
Thought process:- 
1. find the middle node of the linked list
(Apply the hare and turtle approach)
(Middle node list ka Ist half ka end hoga)

2. Reverse the list from 2nd half
(Ist half end ka next node hi 2nd half ka start hoga(Jisko reverse k liye head bna diya jayega))
(same code reverse k liye hoga jese hota h)

3. check the Ist half and 2nd half values is equal or not until the 2nd half is not null
and traverse

Time complexity:- O(n)
Space complexity:- O(n)


Problem5 :- Floyd's Algorithm of detecting loops
Thought Process:-
1. Follow the Approach of Hare and turtle
(jb tk hare ki value null nhi hoti ya hare ki next node ki value null nhi hoti tb tk traverse krna h)

2. khi na khi dono ki value same hogi(Agr hoti h toh loop exist krta h vrna nhi krta)

Time Complexity: O(n)

<!-- problem 6 -->
(Tower of hanoi problem)
1. Use the recursive approach

2. place the n-1 disk to source to helper(AS consider as destination).

3. place the n disk source to helper;

4. place the n-1 disk from helper to destination(Consider the helper as source and vice versa).

Time complexity :- O(2^n -1).


<!-- problem 7 -->
reverse the string

1. use the recursive approach

2. access the last letter of the string through index and by using the recursive approach access all the letters by last.

3. base case is until the index of the string is 0.

Time Complexity :- O(n).

<!-- Problem 8 -->
find the first and last occurence of the given string with given element.

1. Intialize Two variables first and last with -1.(Yeh maloom chl sake ki yeh invalid value h).

2. check that currentchar is equal to given element or not.

3. use the recursive approach until the base case is not meet(if index == str.length).

Time Compexity :- O(n).

<!-- Problem 9 -->
Check if an array is sorted or not.

1. check the array element with the next array element(greater or not).

2. datatype would be boolean.

3. Use the recursive approach.

Time Complexity:- O(n).

<!-- Problem 10 -->

Move all the x to the end of the string

1. Just follow the recursive approach

2. I created two new stringbuilders newstring and xstring.

3. xstring stores all the x element and newstring stores all the non x element.

4. append the x element to the newstring in base case.

Tine complexity :- O(n);

<!-- Problem 11 -->

<!-- Approach 1 -->
Remove the duplicates of the given string.

1. create a new set(Hashset) and add the unique elements in it.

2. Use the recursive approach.

<!-- Approach 2 -->

1. Create a boolean array and check the bool type in every index.

2. then according to that, Add the character to the newstring.

Time complexity :- O(n);

<!-- Problem 12 -->
Print all the subsequences of the given string.

1. we have two choices, currentcharcter + newstring or currentcharacter.

2. use the recursive approach.

Time complexity :- O(2^n).

<!-- Problem 13 -->
print all the unique subsequences of the given string.

1. just create a hashset string, and store the unique string in hashset.

2. check if the string is already added or not.

3. If the hashset is not contain the string then add the string in hashset.

4. use the recursive approach.


<!-- problem 14 -->
print all the Keyapd combination

1. create an array that contains the keypad strings.

2. Access the currentcharcter with the index for given string ("23").

3. Access the current string and start the loop in that.

4. In that loop, call the recursive function and add the current string in newstring.

<!-- Problem 15 -->
print all the permutations of the given string.

1. Using loop, access the currentchar and create the newstring

2. Call the recursive function.

Time Complexity:- O(n!).


<!-- Problem 16 -->
print all the paths in Mazemove from (0,0) to (n,m).

1. Just use the recursive approach.

2. We have two choices right move or down move.

3. the base case should be i = n-1 and j = m-1.


<!-- problem 17 -->
place the tiles of size 1xm in a floor of size nxm.

1. just use the recursive approach.

2. we have two options vertical placements and horizontal placements.
(for vertical:- n-m and for horizontal:- n-1)

3. base case would be where n == m there would be two ways for placed the tiles and where n < m there would be only one way.
 

<!-- Problem 18 -->
find the number of ways in which you can invite n people to your party, single or n-pairs.

1. for call the guest in single ways, There is call(n-1) ways.

2. for call the guest in pair ways, there is n-1 * call(n-2).

3. just use the recursive approach.

4. base case:- for (n=1) there is always only 1 ways and for invite two people(n=2) there is always 2 ways.


<!-- Problem 19 -->
Arrange the unsorted array in sorted form(Merge sort).

{Follow the divide and conqurer technique}.

1. Define the array, for divide the array into two parts just find the mid element.

2. the first array has starting index as its starting index and the last index is the mid index.

3. the second array has starting index as mid+1 index and the last index as end index.

4. call the conqurer function and compare the element of the first array with the second array(traverse it).

5. when the element are sorted then place the element into an empty array and copy to the actual array.

6. Use the recursive approach.

Time complexity:- O(nlogn).
[divide takes logn and conqurer takes O(n) complexity].


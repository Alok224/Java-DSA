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
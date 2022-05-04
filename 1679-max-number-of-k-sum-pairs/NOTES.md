**way 1:
O(nlogn**)**
​
sort and 2 pointer
https://leetcode.com/submissions/detail/692882080/
​
**Way 2** **When finding pair, hashing can be easily used and helps to reduce sorting**
O(n) + O(n)space.
using hashmap to store count and find if nums[i]-k is present, if yes , decrease the count by 1, add in hashmap only if this num hasnt been used in a pair.
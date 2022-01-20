**WAY 1**
**logic is DP and the main thing is , prev ko as an index lelia, now realize if prev eak particular index hei to us prev k liye eak hi max hoga. To int i jo mei lera hun usse kuch fark ni padra, main ans depend krra hei prev pe, to dp khali uski(in hashmap)**
(USED THE ABOVE LOGIC TO REDUCE STORING SPACE,BECAUSE ANS KHALI PREV PE DEPEND KREGA)
https://leetcode.com/submissions/detail/623964154/
now  prev ko as index kyun liya? because range of A[index] is very large and range of index is small. so as to store it.
​
**WAY 2**
BINARY SEARCH O(nLogn).
​
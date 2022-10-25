class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder w1 = new StringBuilder();
        for(String a : word1)
            w1.append(a);
        
        StringBuilder w2 = new StringBuilder();
        for(String a : word2)
            w2.append(a);
        
        return w1.toString().equals(w2.toString());
    }
}
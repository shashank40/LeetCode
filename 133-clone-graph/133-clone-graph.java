/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        
        HashMap<Integer,Node> mp=new HashMap<>();
        HashSet<Integer> s=new HashSet<>();
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        s.add(node.val);
        while(!q.isEmpty()){
            Node temp=q.poll();
            if(!mp.containsKey(temp.val)){
                mp.put(temp.val,new Node(temp.val));
            }
            
            for(Node n:temp.neighbors){
                if(!mp.containsKey(n.val))
                    mp.put(n.val,new Node(n.val));
                  
           mp.get(temp.val).neighbors.add(mp.get(n.val));
                if(!s.contains(n.val)){
                    q.add(n); 
                s.add(n.val);} //////// Yahin good to add in set
            }       /// as queue mei 2 jagah se koi node add ho skti hei, ye sochke ki ye abhi to set mei gya ni(as set mei poll krte time i added phle), to wo glt. As agr eak bnde se queue mei add hogya, to dusare bnde se ni add krna queue mei, to queue mei add kro and khtam
            
        }
        
        return mp.get(node.val);
    }
}
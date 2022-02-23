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
        
        if(node.val==0)
            return new Node();
        
        HashMap<Integer,ArrayList<Node>> mp=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node curr=q.poll();
            mp.put(curr.val,new ArrayList<>());
            for(Node n:curr.neighbors){
                mp.get(curr.val).add(n); 
                if(!mp.containsKey(n.val))
                    q.add(n);
            }
        }
        
        HashMap<Integer,Node> z=new HashMap<>();
        int d=mp.size();
            for(int i=1;i<=d;i++){
                z.put(i,new Node(i));
            }
        for(Map.Entry<Integer,ArrayList<Node>> e:mp.entrySet()){
            for(Node n:e.getValue()){
                z.get(e.getKey()).neighbors.add(z.get(n.val));
            }
        }
        
        return z.get(1);
    }
}
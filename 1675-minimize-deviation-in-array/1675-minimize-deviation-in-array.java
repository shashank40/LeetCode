class Solution {
    public int minimumDeviation(int[] nums) {
        
        ///////// THIS TYPE OF LOGIC KI EAK HI KAAM KRNA PDE
        /////// LOGIC IS KI BS 1 KAAM KRNA PADE, YA TO /2 ya *2
        //// So odd*2 is a valid value of odd as odd can be multiplied by 2
        //// think of it as ki wo odd wala eg : integer 3 ni 6 hi tha(as we save 3*2) so if 6 is suitable to thk, else we do 6/2(bringing it to roiginal value, as if this odd was never changed)
        /// to ab bs har mei /2 krna hei,now if eventually odd aagya hei at any corner(basically bigger end as wahi to kam krenge ham to decrease gap) to tb ruk jana hei as mtlb we got down to the lowest value 
        
        TreeSet<Integer> s=new TreeSet<>(); //////// as finding max and min is O(1) and in same set and no repeats.
        
        for(int a:nums){
            if(a%2==0)
                s.add(a);
            else
                s.add(2*a);
        }
        
        int diff=Integer.MAX_VALUE;
        int curr=-1;
        while(true){
            diff=Math.min(diff,s.last()-s.first());
            if(s.last()%2!=0)
                break;
            
            curr=s.last();
            s.remove(curr);
            curr/=2;
            s.add(curr);
        }
        
        return diff;
    }
}
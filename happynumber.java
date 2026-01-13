class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1)
        {
            if(set.contains(n))
            {
                return false;
            }
            set.add(n);
            n=squares(n);
        }
        return true;
    }
     public static int squares(int n)
        {
            int sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum+=rem*rem;
                n=n/10;
            }
            return sum;
        }
}

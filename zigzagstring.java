class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        if(numRows==1)
        {
            return s;
        }
        StringBuilder rows[]=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            rows[i]=new StringBuilder();
        }
        int currentrow=0;
        Boolean going=false;
        for(char c:s.toCharArray())
        {
            rows[currentrow].append(c);
            if(currentrow==0)
            {
                going=true;
            }
            else if(currentrow==numRows-1)
            {
                going=false;
            }
            currentrow+=(going)?1:-1;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<numRows;i++)
        {
            result.append(rows[i]);
        }
        return result.toString();
    }
}

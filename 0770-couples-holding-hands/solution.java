class Solution {
    public int minSwapsCouples(int[] row) {
        int s=0;
        int wife=0;
        int temp;
        for(int i=0;i<row.length;i=i+2)
        {
            if (row[i] %2 != 0)
            {
            wife=row[i]-1;
            for (int j=i+1;j<row.length;j++)
                {
                if (wife == row[j] && row[i]-1 != row[i+1]) 
                    {   
                    temp=row[i+1];
                    row[i+1]=wife;
                    row[j]=temp;
                    s++;
                    break;
                    }
                }                
            }
            if (row[i] %2 == 0)
            {
            wife=row[i]+1;
            for (int j=i+1;j<row.length;j++)
                {
                if (wife == row[j] && row[i] != row[i+1]-1) 
                    {   
                    temp=row[i+1];
                    row[i+1]=wife;
                    row[j]=temp;
                    s++;
                    break;
                    }
                }                
            }
    }
    return s;
}
}

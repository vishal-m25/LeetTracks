class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> row=new ArrayList<>();
        row.add(1);
        res.add(row);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> prev=res.get(i-1);
            List<Integer> cur=new ArrayList<>();
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(prev.get(j-1)+prev.get(j));
            }
            cur.add(1);
            res.add(cur);
        }return res.get(rowIndex);
    }
}

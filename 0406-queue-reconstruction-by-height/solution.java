
class Solution {
    public int[][] reconstructQueue(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr,(a,b)->(b[0]-a[0]==0 ? a[1]-b[1] : b[0]-a[0]));

        ArrayList<int[]> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            ans.add(arr[i][1],arr[i]);
        }

        int res[][] = new int[n][2];
        for(int i=0; i<n; i++){
            res[i] = ans.get(i);
        }

        return res;
    }
}

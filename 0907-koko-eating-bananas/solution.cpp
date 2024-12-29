class Solution {
public:
    bool isPossible(vector<int>& piles, int mid, int h){
        int count = 0;
        for(int i=0;i<piles.size();i++){
            count += piles[i]/mid;
            if(piles[i] % mid){
                count++;
            }
        }

        if(count <= h) return true;
        return false;
    }


    int minEatingSpeed(vector<int>& piles, int h) {
        int s = 1;
        int e = *max_element(piles.begin(),piles.end());
        
        while(s<e){
            int mid = s+(e-s)/2;
            if(isPossible(piles,mid,h)){
                e = mid;
            }else{
                s = mid+1;
            }
        }

        return s;
    }
};

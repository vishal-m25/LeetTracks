class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int l=*max_element(weights.begin(), weights.end()),r=accumulate(weights.begin(), weights.end(), 0),mid,da,sum;
        while(l<r){
            mid=(l+r)/2;da=1;sum=0;
            for(int & i:weights){
                if((sum+i>mid)){
                    da++;
                    sum=0;
                }
                sum+=i;
            }
            if(da<=days){r=mid;}
            else l=mid+1;
        }
        return l;
    }
};

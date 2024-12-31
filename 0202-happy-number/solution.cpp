class Solution {
public:

    int compute(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
    bool isHappy(int n) {
        int fast=n,slow=n;
        do{
            slow=compute(slow);
            fast=compute(fast);
            fast=compute(fast);
        }while(slow!=fast);
        if(slow==1)return 1;
        else return false;
    }
};


int search(int* nums, int numsSize, int target) {
    int i=0,j=numsSize,k=(i+j)/2;
    while(i!=j){
        k=(i+j)/2;
        if(nums[k]==target){
            return k;
        }
        else if(nums[k]<target){
            i=k+1;
        }
        else{
            j=k;
        }
    }
    return -1;
}

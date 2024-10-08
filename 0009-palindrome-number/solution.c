bool isPalindrome(int x) {
    if(x>-1){
        if(x<=9){
            return true;
        }
        else{
            unsigned int i=0,k=x;
            while(x>0){
                i=i*10+(x%10);
                x/=10;
            }
            if(i==k){
                return true;
            }

        }
    }
    return false;
}

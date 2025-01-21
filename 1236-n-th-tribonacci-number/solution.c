int tribonacci(int n) {
    if(n<2){
        return n;
    }
    if(n==2){
        return 1;
    }
    int a=0,b=1,c=1,i=2,z=0;
    while(i++<n){
        z=a+b+c;
        a=b;
        b=c;
        c=z;
    }
    return z;
}

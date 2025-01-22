bool areOccurrencesEqual(char* s) {
    int ar[26]={0};
    for(int i=0;s[i]!='\0';i++){
        ar[s[i]-97]+=1;
    }
    int k=0;
    for(int i=0;i<26;i++){
        printf("%d ",k);
        if(k==0 && ar[i]!=k){
            k=ar[i];
        }
        else if(ar[i]!=0 && ar[i]!=k){
            return 0;
        }
    }
    return 1;

}

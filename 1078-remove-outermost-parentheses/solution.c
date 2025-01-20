char* removeOuterParentheses(char* s) {
    int l = strlen(s);
    char* a = (char*)malloc((l + 1) * sizeof(char));
    int d=0,i=0,j=0;
    while(i<l){
        if(s[i]=='('){
            if(d++>0){
                a[j++]=s[i];
            }
        }
        else{
            if(--d>0){
                a[j++]=s[i];
            }
        }
        i++;
    }
    a[j]='\0';
    for(int k=0;k<j;k++){
        printf("%c",a[k]);
    }
    return a;    
}

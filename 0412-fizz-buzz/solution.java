class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ar = new ArrayList<>();
        for(int i=0;i<n;i++){
            if((i+1)%15==0){
                ar.add("FizzBuzz");
            }
            else if((i+1)%5==0){
                ar.add("Buzz");
            }
            else if((i+1)%3==0){
                ar.add("Fizz");
            }
            else{
                ar.add(""+(i+1));
            }
        }
        return ar ;
        
    }
}

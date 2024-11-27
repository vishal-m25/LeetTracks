class Solution {

    String[] a = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                    "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                     "Seventeen", "Eighteen", "Nineteen"};
    
    String[] b = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", 
                     "Eighty", "Ninety" , "Hundred"};

     String[] c = {"" , "Thousand" , "Million" , "Billion"};

    public String numberToWords(int num) {

        if(num==0) return "Zero";
       
        if(num<=19) return a[num];

        if(num<100) return less_than_100(num);

        if(num<1000){

            return less_than_1000(num);
        }
        if(num<1000000){
            return less_than_lakhs(num);
        }
        if(num<1000000000){
            return less_than_billion(num);
        }
        if(num>=1000000000){
            
            int start = num/1000000000;
            String s1 = "";
            if(start==1) s1 = "One Billion";
            if(start==2) s1 = "Two Billion";

            String s2 = less_than_billion(num%1000000000);

            s2 = s2.trim();

            if(!s2.equals("")) s1+=" "+s2;

            return s1;
        }
        return "";

        
    }
    String less_than_billion(int num){

        int first = num/1000000;
        num = num%1000000;
         String s1 = "";
         String s2 = "";
         if(first<=19){
            s1 = less_than_20(first);
         }
         else  if(first<100){
            s1 = less_than_100(first);
         }
         else if(first<1000){
            s1 = less_than_1000(first);
         }
        
         if(!s1.equals(""))
         s1 = s1 +" Million";

         s2 = less_than_lakhs(num);

         s2 = s2.trim();

         if(!s2.equals("")) s1 = s1+" "+s2;

         return s1;

        
    }
    String less_than_lakhs(int num){
         
         int first = num/1000;
         int second = num%1000;
        //  System.out.println(second);

         String s1 = "";
         String s2 = "";
         if(first<=19){
            s1 = less_than_20(first);
         }
         else  if(first<100){
            s1 = less_than_100(first);
         }
         else if(first<1000){
            s1 = less_than_1000(first);
         }

         if(!s1.equals(""))
         s1 = s1 + " Thousand";

         if(second<20){
            s2 = less_than_20(second);
         }
         else  if(second<100){
            s2 = less_than_100(second);
         }
         else if(second<1000){
            s2 = less_than_1000(second);
         }
         if(s2.equals("")) return s1;
         return s1 +" "+ s2;
    }
    String less_than_20(int num){
         return a[num];
    }
    String less_than_1000(int num){

           String s = a[num/100];
            s = s + " "+"Hundred";
            String st = less_than_100(num%100);
            if(!st.equals("")) s = s +" "+st;
            return s;

    }
    String less_than_100(int num){

        if(num<=19) return a[num];

        String s = "";
        if(num/10!=0)
        s = b[num/10];
            if(num%10!=0){
                if(!s.equals(""))
                s+=" "+a[num%10];
                else s+=a[num%10];
            }
            return s;

    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine)
    {
        boolean result = false;
        boolean endOfMagazineCheck = false;
        for (int i = 0; i < ransomNote.length(); i++)
        {
            if (magazine.length() == 0)
            {
                result = false;
                break;
            }
            
            for (int j = 0; j < magazine.length(); j++)
            {
                               
                if (ransomNote.charAt(i) == magazine.charAt(j))
                {
                    result = true;
                    if (j == 0)
                    {
                        magazine = magazine.substring(j+1, magazine.length());
                        //System.out.println(magazine);
                    }
                    else if (j == magazine.length() -1)
                    {
                        magazine = magazine.substring(0, j);
                        //System.out.println(magazine);
                    }
                    else
                    {
                        magazine = magazine.substring(0, j) + magazine.substring(j+1, magazine.length());
                        //System.out.println(magazine);
                    }
                    break;
                }
                else
                {
                    result = false;
                    if (j == magazine.length()-1)
                    {
                    endOfMagazineCheck = true;    
                    }
                }
                
            }
            if (endOfMagazineCheck)
            {
                result = false;
                break;
            }
        }
        return result;    
    }
}

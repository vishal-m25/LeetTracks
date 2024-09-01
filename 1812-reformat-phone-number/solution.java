class Solution {
    public String reformatNumber(String number) {

        number = number.replace(" ", "");
        number = number.replace("/", "");
        number = number.replace("-", "");
        if (number.length() < 4) {
            return number;
        }
        String newNum = "";
        while (number.length() > 0) {
            if (number.length() < 4) {
                newNum += number;
                number = "";
            } else if (number.length() == 4) {
                newNum += number.substring(0, 2);
                newNum += "-";
                newNum += number.substring(2);
                number = "";
            } else if (number.length() > 4) {
                newNum += number.substring(0, 3);
                 newNum += "-";
                number = number.substring(3);
            }
        }
        return newNum;
    }
}

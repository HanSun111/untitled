public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() {
    }
    public int countCharacters(String character, String searchString) {
        int i = 0;
        int num;
        for (num = 0; i < searchString.length(); i++) {
            String x = searchString.substring(i, i + 1);
            if (x == character) {
                num++;
            }
        }
        return num;
    }

    public String reverseString(String origString) {
        String unoReverse = "";
        for (int i = 0; i < origString.length(); i++) {
            String newStr = origString.charAt(i) + "";
            unoReverse = newStr + unoReverse;
        }
        return unoReverse;
    }

    public String reverseString2(String origString) {
        String unoReverse = "";
        for (int i = origString.length(); i > 0; i--) {
            String newStr = origString.charAt(i) + "";
            unoReverse = newStr + unoReverse;
        }
        return unoReverse;
    }
    public int countVowels(String origString)
    {
        int aEIOU = countCharacters("A", origString) + countCharacters("E", origString) + countCharacters("I", origString) + countCharacters("O", origString) + countCharacters("U", origString) + countCharacters("a", origString) + countCharacters("e", origString) + countCharacters("i", origString) + countCharacters("o", origString) + countCharacters("u", origString);
        return aEIOU;
    }

    public int countString(String searchString, String origString)
    {
        int i;
        int y = searchString.length();
        int x = 0;
        String s = searchString.toLowerCase();
        String o = origString.toLowerCase();
        for(i = 0; i <= o.length() - s.length(); i++) {
            String match = o.substring(i, i + y);
                if(s.equals(match)) {
                    x++;
                }
            }
        return x;
    }

    public String removeString(String searchString, String origString)
    {
        int i = 0;
        String newStr = origString;
        while(newStr.indexOf(searchString) != -1){
            i = newStr.indexOf(searchString);
            newStr = newStr.substring(0, i) + newStr.substring(i + searchString.length());
        }
        return newStr;
    }

    public String replaceCharacter(String searchChar, String origStr, String replaceChar) {
        int i = 0;
        String newStr = origStr;
        while (newStr.indexOf(searchChar) != -1) {
            i = newStr.indexOf(searchChar);
            newStr = newStr.substring(0, i) + replaceChar + newStr.substring(i + 1 );
        }
        return newStr;
    }
}



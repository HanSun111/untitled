public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() {
    }

    /* Returns the number of times "character" appears in "searchString"
       This should be case sensitive!

       Examples:
       - if character = "a" and searchString = "Apples and bananas",
         this method returns 4
       - if character = "A" and searchString = "Apples and bananas",
         this method returns 1
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
      */
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

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
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



}



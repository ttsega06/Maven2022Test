public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    /**
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     *
     * @return Given a string word, return true if the usage of capitals in it is right.
     */
    @Override
    public boolean detectCapitalUse() {
        String word = getString();
        if (word.equals((word.toUpperCase()))) {
            return true;
        }
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if ('A' <= ch && ch <= 'Z') {

                return false;
            }
        }

        return true;

    }

}


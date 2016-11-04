public class Exercise {

    //Ex 1
    public static String replaceChar(String textToMod, char replaceThis, char replaceWith) {

        return textToMod.chars().mapToObj(e -> (char) e)
                .map(c -> replace(replaceThis, replaceWith, c))
                .map(Object::toString)
                .reduce((a, b) -> (a + b)).get();

    }

    private static Character replace(char replaceThis, char replaceWith, Character charPassed) {
        if (charPassed == replaceThis) {
            return replaceWith;
        }

        return charPassed;
    }

    //Ex 2
    public static boolean areAnagrams(String word1, String word2) {

        if (!haveSameLength(word1, word2) || !containChar(word1.charAt(0), word2)) {
            return false;
        }

        return word1.equals(word2) || (areAnagrams(word1.substring(1), removeChar(word1.charAt(0), word2)));
    }

    private static boolean containChar(char firstChar, String word2) {
        return word2.indexOf(firstChar) != -1;
    }

    private static boolean haveSameLength(String word1, String word2) {
        return word1.length() == word2.length();
    }

    public static String removeChar(char charToRemove, String word) {

        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.deleteCharAt(word.indexOf(charToRemove));

        return stringBuilder.toString();

    }

}

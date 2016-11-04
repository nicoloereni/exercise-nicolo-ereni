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
        return getSortedWord(word1).equals(getSortedWord(word2));
    }

    private static String getSortedWord(String word1) {
        return word1.chars()
                .mapToObj(e -> (char) e)
                .sorted()
                .map(Object::toString)
                .reduce((a, b) -> (a + b))
                .get();
    }

}

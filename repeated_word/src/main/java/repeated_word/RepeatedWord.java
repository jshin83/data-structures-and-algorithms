/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package repeated_word;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {
    private final static Set<Character> SPECIAL_CHARACTERS = new HashSet<>(Arrays.asList(',', '.', '!', '?', '"'));
    private static Set<String> seen = new HashSet<>();


    public static void main(String[] args) {
        System.out.println(repeated_word_sorted("hello the dog runs with the cow"));
    }

    /**
     * Static method that checks an input String
     * and returns first wod that occurs twice.
     * Will evaluate ending punctuation
     * and is case-sensitive.
     * @param parameter String, input
     * @return String, word that occurs twice first
     */
    public static String repeated_word(String parameter) {

        if (parameter == null || parameter.equals("")) {
            throw new IllegalArgumentException("Input is empty");
        }
        String[] words = parameter.split(" ");
        for(int i = 0; i < words.length; i++) {
            // check if special character and substring
            if(SPECIAL_CHARACTERS.contains(words[i].charAt(words[i].length() - 1))) {
                words[i] = words[i].substring(0, words[i].length() - 1);
            }
            // make lowercase
            words[i] = words[i].toLowerCase();
            // check set to see if word was already seen
            // and if so, return
            if(seen.contains(words[i])) {
                return words[i];
            }
            // add to seen list
            seen.add(words[i]);
        }
        return null;
    }

    public static String repeated_word_sorted(String parameter) {
        if (parameter == null || parameter.equals("")) {
            throw new IllegalArgumentException("Input is empty");
        }

        String[] words = parameter.split(" ");
        Arrays.sort(words);

        for (int i = 0; i < words.length - 1; i++) {
            if (SPECIAL_CHARACTERS.contains(words[i].charAt(words[i].length() - 1))) {
                words[i] = words[i].substring(0, words[i].length() - 1);
            }
            if (SPECIAL_CHARACTERS.contains(words[i + 1].charAt(words[i + 1].length() - 1))) {
                words[i + 1] = words[i + 1].substring(0, words[i + 1].length() - 1);
            }
            if (words[i].toLowerCase().equals(words[i + 1].toLowerCase())) {
                return words[i];
            }
        }
        return null;
    }
}

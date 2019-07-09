# Repeated Word

## Challenge Description
<!-- Description of the challenge -->
    public static String repeated_word(String parameter)
    + Static method that checks an input String
     and returns first wod that occurs twice.
     Will evaluate ending punctuation
     and is **case-insensitive**.
     @param parameter String, input
     @return String, word that occurs twice first

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
`repeated_words`

After checking for edge cases, I split the input into an array.
I check a punctuation set to see if it ends with common special characters. This is not a full validation,
but only checks for most common cases ('.', ',', '?', '!', '"'). Does not check for beginning special characters (as
I stated, it is not fully - encompassing).
**Treats words without case-sensitivity ie 'It' is equal to 'it'.**
Big (O) is O(N) for time, as every word may potentially be checked.
For lookup, it is O(1), as I use a set to store seen characters.
For time, it is potentially O(N), as a set may store up to O(N -1) words.

`repeated_words_sorted`

For fun, I created another method that splits the word, and sorts the array, and iterates through the sorted array. This
is better in the sense that no additional data structure is used, but if the pair is near the end of the array,
may have to iterate longer than the previous method, which just returns when the word is encountered in place
of where it is in the original input. O(N) time, O(1) space

Yes, I am aware my code could be drier (ie function to check punctuation and process word to lowercase).

## Solution
<!-- Embedded whiteboard image -->
![repeated word](../assets/repeated.jpg)


// This Java code counts how many times each word from a given array appears in the provided text.

import java.util.HashMap;
import java.util.Map;

public class third {
    public static void main(String[] args) {
        // Input text and array of words to search for
        String text = "Це книга.Книга стоїть в шафі, це шафа! Ця книга дуже стара, шафа також.";
        String[] words = { "книга", "шафа", "Це" };

        // Map to store word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        if (text.isEmpty()) {
            System.out.println("Text is empty");
        } else if (words.length == 0) {
            System.out.println("Array of words is empty");
        } else {
            // Split the text into sentences using period, comma, or exclamation mark as delimiters
            String[] sentences = text.split("[.,!?]");

            for (String sentence : sentences) {
                for (String word : words) {
                    // Convert word and sentence to lowercase for case-insensitive search
                    word = word.toLowerCase();
                    sentence = sentence.toLowerCase();

                    // Use StringBuffer to store the sentence and word
                    StringBuffer sentenceBuffer = new StringBuffer(sentence);
                    StringBuffer wordBuffer = new StringBuffer(word);

                    // Remove unnecessary spaces from the beginning and end of the sentence

                    // Search for occurrences of the word in the sentence
                    int index = sentenceBuffer.indexOf(wordBuffer.toString());
                    int count = 0; // Counter for the number of occurrences of the word in the sentence
                    while (index != -1) {
                        int sentenceEndIndex = sentenceBuffer.indexOf(" ", index);
                        if (sentenceEndIndex == -1) {
                            // If the word is at the end of the sentence
                            sentenceEndIndex = sentenceBuffer.length();
                        }
                        String matchedWord = sentenceBuffer.substring(index, sentenceEndIndex);
                        wordCounts.put(matchedWord, wordCounts.getOrDefault(matchedWord, 0) + 1);

                        count++; // Increment the count of occurrences of the word in the sentence
                        if (count >= 2) {
                            // If the word occurs more than once in the sentence, skip it
                            wordCounts.put(matchedWord, wordCounts.get(matchedWord) - 1);
                        }

                        // Move the index to search for other occurrences of the word in the sentence
                        index = sentenceBuffer.indexOf(wordBuffer.toString(), index + 1);
                    }
                }
            }

            // Output the results
            for (String word : words) {
                System.out.println("The word '" + word + "' appears in "
                        + wordCounts.getOrDefault(word.toLowerCase(), 0) + " sentences.");
            }
        }
    }
}



/**
 * Problem Description:
 * You are given two strings, word1 and word2. Merge these strings by adding letters in alternating order,
 * starting with word1. If one string is longer than the other, append the additional letters onto the end
 * of the merged string.
 *
 * Examples:
 * 1. Input: word1 = "abc", word2 = "pqr"
 *    Output: "apbqcr"
 *    Explanation: The merged string will be "a p b q c r", merging the characters alternately from word1 and word2.
 *
 * 2. Input: word1 = "ab", word2 = "pqrs"
 *    Output: "apbqrs"
 *    Explanation: As word2 is longer, the remaining characters "rs" are appended at the end.
 *
 * 3. Input: word1 = "abcd", word2 = "pq"
 *    Output: "apbqcd"
 *    Explanation: As word1 is longer, the remaining characters "cd" are appended at the end.
 */

package Leetcode;

class Leetcode {  // ✅ 클래스명이 파일명과 동일해야 함
    public String Leetcode(String word1, String word2) {
        System.out.println("========== Merge Strings Alternately  ");
        StringBuilder mergeString = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            mergeString.append(word1.charAt(i++));
            mergeString.append(word2.charAt(j++));
        }

        while (i < word1.length()) {
            mergeString.append(word2.charAt(j++));
            mergeString.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            mergeString.append(word1.charAt(i++));
            mergeString.append(word2.charAt(j++));
        }

        return mergeString.toString();
    }
}
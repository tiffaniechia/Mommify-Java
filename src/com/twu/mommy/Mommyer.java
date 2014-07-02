package com.twu.mommy;

/**
 * Created by tchia on 2/7/14.
 */
public class Mommyer {
    private String[] VOWELS = {"a", "e", "i", "o", "u"};
    private String MOMMY = "mommy";

    public String mommify(String word) {
        for (String vowel : VOWELS) {
            if (word.contains(vowel)) {
                String result = word.replaceAll(vowel, MOMMY);
                return result.replace("mommymommy", MOMMY);
            }
        }
        return word;
    }
}

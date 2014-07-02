package com.twu.mommy;

/**
 * Created by tchia on 2/7/14.
 */
public class Mommyer {
    private String MOMMY = "mommy";

    public String mommify(String word) {
        double lengthOfOriginalWord = word.length();
        double numberOfVowels = lengthOfOriginalWord - word.replaceAll("[aeiouAEIOU]","").length();
        if (numberOfVowels/lengthOfOriginalWord > 0.3) {
            return word.replaceAll("[aeiouAEIOU]+", MOMMY);
        }else{
            return word;
        }
    }

}

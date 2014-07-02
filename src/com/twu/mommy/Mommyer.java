package com.twu.mommy;

/**
 * Created by tchia on 2/7/14.
 */
public class Mommyer {
    private String MOMMY = "mommy";

    public String mommify(String word) {
                return word.replaceAll("[aeiou]+", MOMMY);
            
        }

}

package com.twu.mommy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by tchia on 2/7/14.
 */
public class VowelsTest {

    private Mommyer mommyer;

    @Before
    public void setUp() throws Exception {
        mommyer = new Mommyer();

    }

    @Test
    public void shouldReturnEmptyIfEmpty() throws Exception {
        String empty = " ";
        assertThat(mommyer.mommify(empty), is(" "));
    }

    @Test
    public void shouldReturnBIfB() throws Exception {
        String b = "b";
        assertThat(mommyer.mommify(b), is("b"));
    }

    @Test
    public void shouldReturnAIfA() throws Exception {
        String a = "a";
        assertThat(mommyer.mommify(a), is("mommy"));
    }

    @Test
    public void shouldReturnMommybIfAb() throws Exception {
        String ab = "ab";
        assertThat(mommyer.mommify(ab), is("mommyb"));
    }

    @Test
    public void shouldReturnBmommyIfBa() throws Exception {
        String ba = "ba";
        assertThat(mommyer.mommify(ba), is("bmommy"));
    }

    @Test
    public void shouldReturnMommyIfAa() throws Exception {
        String aa = "aa";
        assertThat(mommyer.mommify(aa), is("mommy"));
    }

    @Test
    public void shouldReturnBbIfBb() throws Exception {
        String bb = "bb";
        assertThat(mommyer.mommify(bb), is("bb"));
    }

    @Test
    public void shouldReturnMommybmommyIfAba() throws Exception {
        String aba = "aba";
        assertThat(mommyer.mommify(aba), is("mommybmommy"));
    }

    @Test
    public void shouldReturnBmommybIfAba() throws Exception {
        String bab = "bab";
        assertThat(mommyer.mommify(bab), is("bmommyb"));
    }

    @Test
    public void shouldReturnMommyIfAaa() throws Exception {
        String aaa = "aaa";
        assertThat(mommyer.mommify(aaa), is("mommy"));
    }

    @Test
    public void shouldOnlyReplaceIfVowelIsMoreThanThirtyPercent() throws Exception {
        String abbbbbb = "abbbbbb";
        assertThat(mommyer.mommify(abbbbbb), is("abbbbbb"));
    }

    @Test
    public void shouldBeAbleToReadUpcase() throws Exception {
        String AAA = "AAA";
        assertThat(mommyer.mommify(AAA), is("mommy"));
    }
}

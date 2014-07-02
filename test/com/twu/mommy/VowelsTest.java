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
    public void should_return_empty_if_empty() throws Exception {
        String empty = " ";
        assertThat(mommyer.mommify(empty), is(" "));
    }

    @Test
    public void should_return_b_if_b() throws Exception {
        String b = "b";
        assertThat(mommyer.mommify(b), is("b"));
    }

    @Test
    public void should_return_a_if_a() throws Exception {
        String a = "a";
        assertThat(mommyer.mommify(a), is("mommy"));
    }

    @Test
    public void should_return_mommyb_if_ab() throws Exception {
        String ab = "ab";
        assertThat(mommyer.mommify(ab), is("mommyb"));
    }

    @Test
    public void should_return_bmommy_if_ba() throws Exception {
        String ba = "ba";
        assertThat(mommyer.mommify(ba), is("bmommy"));
    }

    @Test
    public void should_return_mommy_if_aa() throws Exception {
        String aa = "aa";
        assertThat(mommyer.mommify(aa), is("mommy"));
    }

    @Test
    public void should_return_bb_if_bb() throws Exception {
        String bb = "bb";
        assertThat(mommyer.mommify(bb), is("bb"));
    }

    @Test
    public void should_return_if_mommybmommy_aba() throws Exception {
        String aba = "aba";
        assertThat(mommyer.mommify(aba), is("mommybmommy"));
    }

    @Test
    public void should_return_if_bmommyb_aba() throws Exception {
        String bab = "bab";
        assertThat(mommyer.mommify(bab), is("bmommyb"));
    }

    @Test
    public void should_return_mommy_if_aaa() throws Exception {
        String aaa = "aaa";
        assertThat(mommyer.mommify(aaa), is("mommy"));
    }


}

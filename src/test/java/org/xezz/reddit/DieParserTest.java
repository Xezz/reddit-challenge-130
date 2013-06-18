package org.xezz.reddit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * User: Xezz
 * Date: 18.06.13
 * Time: 12:46
 */
public class DieParserTest {
    @Test
    public void testParse() throws Exception {
        final String input = "2d20";
        final Die parseResult = DieParser.parse(input);
        assertThat("Times was not 2 rolls", parseResult.getTimes(), is(equalTo(2)));
        assertThat("Faces was not 20 faces", parseResult.getFaces(), is(equalTo(20)));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseThrowsNFEOnFirstParameter() throws Exception {
        final String input = "2Fd1";
        DieParser.parse(input);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseThrowsNFEOnSecondParameter() throws Exception {
        final String input = "2d1F";
        DieParser.parse(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseThrowsIAEOnNullValue() throws Exception {
        DieParser.parse(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseThrowsIAEOnOneResult() throws Exception {
        final String input = "2";
        DieParser.parse(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseThrowsIAEOnThreeResults() throws Exception {
        final String input = "2d3d1666";
        DieParser.parse(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseThrowsIAEOnEmptyInput() throws Exception {
        final String input = "";
        DieParser.parse(input);
    }
}

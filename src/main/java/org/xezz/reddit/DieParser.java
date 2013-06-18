package org.xezz.reddit;

/**
 * User: Xezz
 * Date: 18.06.13
 * Time: 12:45
 */
public class DieParser {

    public static Die parse(final String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input must not be null");
        }
        final String[] split = input.split("d");
        if (split.length != 2) {
            throw new IllegalArgumentException("Input was not of a correct format, should be XXdYY");
        }
        final int times = Integer.parseInt(split[0]);
        final int faces = Integer.parseInt(split[1]);

        return new Die(times, faces);
    }
}

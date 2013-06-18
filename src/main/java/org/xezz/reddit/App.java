package org.xezz.reddit;

import java.util.List;

/**
 * Reddit challenge 130
 */
public class App {
    public static void main(String[] args) {

        final List<Integer> rolledTwoDice = DieParser.parse("2d20").rollDice();
        final List<Integer> rolledFourDice = DieParser.parse("4d6").rollDice();
        String outputTwoDice = getString(rolledTwoDice);
        String outputFourDice = getString(rolledFourDice);
        System.out.println(outputTwoDice);
        System.out.println(outputFourDice);
    }

    private static String getString(List<Integer> rolledTwoDice) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer roll : rolledTwoDice) {
            stringBuilder.append(roll).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}

package org.xezz.reddit;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        final List<Integer> rolledTwoDice = DieParser.parse("2d20").rollDice();
        final List<Integer> rolledFourDice = DieParser.parse("4d6").rollDice();
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer roll : rolledTwoDice) {
            stringBuilder.append(roll).append(" ");
        }
        String outputTwoDice = stringBuilder.toString().trim();
        stringBuilder = new StringBuilder();
        for (Integer roll: rolledFourDice) {
            stringBuilder.append(roll).append(" ");
        }
        String outputFourDice = stringBuilder.toString().trim();
        System.out.println(outputTwoDice);
        System.out.println(outputFourDice);
    }
}

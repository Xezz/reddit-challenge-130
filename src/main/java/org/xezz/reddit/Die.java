package org.xezz.reddit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * User: Xezz
 * Date: 18.06.13
 * Time: 12:38
 */
public class Die {
    private final int times;
    private final int faces;
    private final Random randomGenerator;

    public Die(final int times, final int faces) {
        if (times < 1) {
            throw new IllegalArgumentException("Faces must be greater or equal to 1");
        }
        if (faces < 2) {
            throw new IllegalArgumentException("Faces must be greater or equal to 2");
        }
        this.times = times;
        this.faces = faces;
        // Could try with current time as seed too
        randomGenerator = new Random();
    }

    public List<Integer> rollDice() {
        final List<Integer> diceRolls = new ArrayList<Integer>(times);
        for (int i = 0; i < times; i++) {
            Integer roll = randomGenerator.nextInt(faces) + 1;
            diceRolls.add(roll);
        }
        return diceRolls;
    }

    public int getFaces() {
        return faces;
    }

    public int getTimes() {
        return times;
    }
}

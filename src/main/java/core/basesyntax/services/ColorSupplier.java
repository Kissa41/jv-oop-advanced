package core.basesyntax.services;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor(){
        Color[] colors = Color.values();
        Random rand = new Random();
        return String.valueOf(colors[rand.nextInt(colors.length)]).toLowerCase();
    }
}

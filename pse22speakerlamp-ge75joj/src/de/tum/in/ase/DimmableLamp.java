package de.tum.in.ase;

public class DimmableLamp implements Lamp {

    private int brightness = 0;

    private int previousBrightness = 100;

    @Override
    public void toggle() {
        setBrightness(brightness > 0 ? 0 : previousBrightness);
    }

    @Override
    public boolean isTurnedOn() {
        return brightness > 0;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int newBrightness) {
        if (newBrightness >=0 && brightness <= 100) {
            if (brightness > 0) {
                previousBrightness = brightness;
            }
            brightness = newBrightness;
            System.out.println("Set brightness of DimmableLamp to " + brightness + ".");
        }
    }
}

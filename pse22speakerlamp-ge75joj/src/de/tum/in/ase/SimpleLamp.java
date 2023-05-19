package de.tum.in.ase;

public class SimpleLamp implements Lamp {

    private boolean turnedOn = false;


    @Override
    public void toggle() {
        setTurnedOn(!turnedOn);
    }

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        if (turnedOn) {
            System.out.println("Turning on SimpleLamp");
        } else {
            System.out.println("Turing off SimpleLamp");
        }
        this.turnedOn = turnedOn;
    }
}

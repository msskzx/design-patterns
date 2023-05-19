package de.tum.in.ase;

import java.util.HashSet;
import java.util.Set;

public class HomeKit {

    /*
     * Accessories
     */
    private Set<Lamp> lamps = new HashSet<>();
    private Set<Speaker> speakers = new HashSet<>();

    private Set<Scene> scenes = new HashSet<>();

    public void connect(Lamp lamp) {
        lamps.add(lamp);
    }

    public void connect(Speaker speaker) {
        speakers.add(speaker);
    }

    public Scene configure(Scene scene) {
        scenes.add(scene);
        return scene;
    }
}

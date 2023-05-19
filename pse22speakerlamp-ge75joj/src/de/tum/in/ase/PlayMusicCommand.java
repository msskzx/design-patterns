package de.tum.in.ase;

public class PlayMusicCommand implements Command {

    private Speaker speaker;

    public PlayMusicCommand(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.play();
    }
}

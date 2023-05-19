package de.tum.in.ase.pse;

public class CapturePhotoCommand implements Command {

	private Camera camera;

	public CapturePhotoCommand(Camera camera) {
		this.camera = camera;
	}

	@Override
	public void execute() {
		camera.takePicture();
	}

}

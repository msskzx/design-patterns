package de.tum.in.ase.pse.dispatcher;

public final class DispatcherMain {
	private DispatcherMain() {

	}

	public static void main(String[] args) {
		//This is a workaround for a known issue when starting JavaFX applications
		Dispatcher.startApp(args);

	}

}

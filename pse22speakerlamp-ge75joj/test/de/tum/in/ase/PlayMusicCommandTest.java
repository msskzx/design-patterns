package de.tum.in.ase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PlayMusicCommandTest {
	/**
	 * TODO II: Implement a test case for the play music command. Use Mockito to
	 * mock the speaker. Test that the PlayMusicCommand correctly calls the Speaker
	 * methods.
	 */

	private PlayMusicCommand playMusicCommand;
	private Speaker speakerMock = mock(Speaker.class);

	@Test
	void testPlayMusicCommand() {

		playMusicCommand = new PlayMusicCommand(speakerMock);

		playMusicCommand.execute();

		verify(speakerMock).play();
	}

}

package de.tum.in.ase.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.tum.in.ase.models.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.*;

import java.time.LocalDateTime;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ContextConfiguration(classes = RollerShutterController.class)
class RollerShutterControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	private static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@BeforeEach
	void setUp() {
		ModelStorage.createSampleRollerShutters();
	}

	@Test
	void testGetAllRollerShutters() throws Exception {
        // TODO II.1:
        // Write test cases for the following scenario:
        // Receive all roller shutters from the API
	}

	@Test
	void testGetRollerShutterByIdExisting() throws Exception {
        // TODO II.2:
        // Write test cases for the following scenario:
        // Receive details for one single roller shutter with an existing ID
	}

	@Test
	void testGetRollerShutterByIdNotExisting() throws Exception {
        // TODO II.3:
        // Write test cases for the following scenario:
        // Receive details for one none existing roller shutter (invalid ID)
	}

	@Test
	void testUpdateRollerShutter() throws Exception {
        // TODO II.4:
        // Write test cases for the following scenario:
        // Change the details for one single roller shutter
	}

}

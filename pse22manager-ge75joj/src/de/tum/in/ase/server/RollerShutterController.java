package de.tum.in.ase.server;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.tum.in.ase.models.RollerShutter;

@RestController
public class RollerShutterController {

	// TODO I.1: Receive all roller shutters from the API.
	@GetMapping("/roller-shutters")
	public List<RollerShutter> index() {
		return ModelStorage.getAllRollerShutters();
	}

	// TODO I.2: Receive details for one single roller shutter.
	@GetMapping("/roller-shutters/{id}")
	public RollerShutter get(@PathVariable Long id) {
		return ModelStorage.getRollerShutterById(id);
	}

	// TODO I.3 Change the details for one single roller shutter.
	@PutMapping("/roller-shutters/{id}")
	public void save(@RequestBody RollerShutter newRollerShutter, @PathVariable Long id) {
		ModelStorage.saveRollerShutter(newRollerShutter);
	}

}

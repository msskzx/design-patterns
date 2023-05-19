package de.tum.in.ase.server;

import de.tum.in.ase.models.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Component
public final class ModelStorage {

	public static final String audimax = "Audimax im Galileo (8120.01.101)";
	public static final String mihs1 = "MI HS 1, Friedrich L. Bauer Hoersaal (5602.EG.001)";

	private static Map<Long, RollerShutter> rollerShutterMap;

	public static List<RollerShutter> getAllRollerShutters() {
		return new ArrayList<>(rollerShutterMap.values());
	}

	public static RollerShutter getRollerShutterById(Long id) {
		return rollerShutterMap.get(id);
	}

	public static void saveRollerShutter(RollerShutter rollerShutter) {
		rollerShutterMap.put(rollerShutter.getId(), rollerShutter);
	}

	public static void deleteRollerShutter(RollerShutter rollerShutter) {
		rollerShutterMap.remove(rollerShutter.getId());
	}

	public static void createSampleRollerShutters() {
		rollerShutterMap = new HashMap<>();

		RollerShutter rollerShutter1 = new RollerShutter(createRandomId(), mihs1);
		RollerShutter rollerShutter2 = new RollerShutter(createRandomId(), audimax);

		rollerShutterMap.put(rollerShutter1.getId(), rollerShutter1);
		rollerShutterMap.put(rollerShutter2.getId(), rollerShutter2);
	}

	public static Long createRandomId() {
		return ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
	}
}

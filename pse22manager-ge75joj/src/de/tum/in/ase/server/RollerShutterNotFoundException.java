package de.tum.in.ase.server;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Roller Shutter not found")
public class RollerShutterNotFoundException extends RuntimeException {
}


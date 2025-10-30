package org.robots;

import java.lang.Exception;

public class InvalidNbBatteryException extends Exception {
    public InvalidNbBatteryException(String message) {
        super(message);
    }
}

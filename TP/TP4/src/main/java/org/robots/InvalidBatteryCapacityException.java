package org.robots;

import java.lang.Exception;

public class InvalidBatteryCapacityException extends Exception {
    public InvalidBatteryCapacityException(String message) {
        super(message);
    }
}

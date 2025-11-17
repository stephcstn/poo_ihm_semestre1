package org.robots;

import java.lang.Exception;

public class InvalidBatteryTypeException extends Exception {
    public InvalidBatteryTypeException(String message) {
        super(message);
    }
}

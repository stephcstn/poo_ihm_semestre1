package org.portes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoorTest {
    private Door d1;
    private Door d2;
    private List<Door> doorList;

    @BeforeEach
    public void setUp() {
        this.d1 = new Door();
        this.d2 = new Door();
        this.doorList = List.of(d1, d2);
    }

    @Test
    public void open() {
        d1.open();
        assertTrue(d1.isOpen);
    }

    @Test
    public void close() {
        d1.close();
        d1.close();
        assertFalse(d1.isOpen);
    }

    @Test
    public void testToString() {
        assertEquals("Door : fermée", d1.toString());
    }

    @Test
    public void testToString2() {
        d1.open();
        assertEquals("Door : ouverte", d1.toString());
    }

}
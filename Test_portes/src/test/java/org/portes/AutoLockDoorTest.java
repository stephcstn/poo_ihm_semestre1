package org.portes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoLockDoorTest {
    private AutoLockDoor d1;
    private AutoLockDoor d2;

    @BeforeEach
    public void setUp() {
        this.d1 = new AutoLockDoor();
        this.d2 = new AutoLockDoor(true);
    }

    @Test
    public void unlock() {
        d1.unlock();
        assertFalse(d1.isLocked);
    }

    @Test
    public void open1(){
        d1.unlock();
        d1.open();
        assertTrue(d1.isOpen);
        assertFalse(d1.isLocked);
    }

    @Test
    public void open2(){
        d1.close();
        d2.open();
        assertFalse(d2.isOpen);
        assertTrue(d2.isLocked);
    }

    @Test
    public void close(){
        d1.unlock();
        d1.open();
        d1.close();
        assertFalse(d1.isOpen);
        assertTrue(d1.isLocked);
    }

}
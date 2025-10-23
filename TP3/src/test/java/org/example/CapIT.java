package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapIT {


    @Test
    public void testCapNull() {
        Cap capNull = new Cap();
        assertEquals(capNull.BRAND, Cap.DEFAULT_BRAND);
    }

    @Test
    public void testCapDefault() {
        Cap cap = new Cap();
        assertEquals(cap.BRAND, Cap.DEFAULT_BRAND);
    }

    @Test
    public void testCap() {
        String brand = "Reynolds";
        Cap capNull = new Cap(brand);
        assertEquals(capNull.BRAND, brand);
    }


}

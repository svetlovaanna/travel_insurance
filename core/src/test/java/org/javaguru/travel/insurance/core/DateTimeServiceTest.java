package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeServiceTest {

    @Test
    public void shouldEquals() {
        Date from = new Date();
        Date to = new Date();
        assertEquals(from.toString(), to.toString());
    }

}
package com.akhil;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GradeManagerTest {

    @Test
    public void testGetGrade() {
        GradeManager gm = new GradeManager();
        assertEquals("A", gm.getGrade(95));
        assertEquals("B", gm.getGrade(85));
        assertEquals("F", gm.getGrade(40));
    }
}

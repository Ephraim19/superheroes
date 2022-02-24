package module;

import models.Squad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @Test
    void testForInstancesOfSquad () {
        Squad squad = new Squad(5,"Chelsea","Fight crime");
        assertTrue(true);
    }

    @Test
    void testGetterMethodofMaxSize() {
        Squad squad = new Squad(5,"Chelsea","Fight crime");
        assertEquals(5,squad.getMaxSize());
    }
    @Test
    void testGetterMethodofName() {
        Squad squad = new Squad(5,"Chelsea","Fight crime");
        assertEquals("Chelsea",squad.getName());
    }
    @Test
    void testGetterMethodofDedicatedCause() {
        Squad squad = new Squad(5,"Chelsea","Fight crime");
        assertEquals("Fight crime",squad.getDedicatedCause());
    }
}










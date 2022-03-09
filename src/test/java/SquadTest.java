import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @Test
    void testForInstancesOfSquad () {

        Squad squad = new Squad(5,"Chelsea","Fight crime");
        assertTrue(true);
    }

    @Test
    void testGetterMethodOfMaxSize() {
        Squad squad = new Squad(5,"Chelsea","Fight crime");
        assertEquals(5,squad.getMaxSize());
    }
    @Test
    void testGetterMethodOfName() {
        Squad squad = new Squad(5,"Chelsea","Fight crime");
        assertEquals("Chelsea",squad.getName());
    }
    @Test
    void testGetterMethodOfDedicatedCause() {
        Squad squad = new Squad(5,"Chelsea","Fight crime");
        assertEquals("Fight crime",squad.getDedicatedCause());
    }
}










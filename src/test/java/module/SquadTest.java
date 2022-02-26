package module;

import models.Hero;
import models.Squad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @Test
    void testForInstancesOfSquad () {
        Hero testHero = new Hero("Eph",21,"positive","none");

        Squad squad = new Squad(5,"Chelsea","Fight crime",testHero);
        assertTrue(true);
    }

    @Test
    void testGetterMethodofMaxSize() {
        Hero testHero = new Hero("Eph",21,"positive","none");
        Squad squad = new Squad(5,"Chelsea","Fight crime",testHero);
        assertEquals(5,squad.getMaxSize());
    }
    @Test
    void testGetterMethodofName() {
        Hero testHero = new Hero("Eph",21,"positive","none");
        Squad squad = new Squad(5,"Chelsea","Fight crime",testHero);
        assertEquals("Chelsea",squad.getName());
    }
    @Test
    void testGetterMethodofDedicatedCause() {
        Hero testHero = new Hero("Eph",21,"positive","none");
        Squad squad = new Squad(5,"Chelsea","Fight crime",testHero);
        assertEquals("Fight crime",squad.getDedicatedCause());
    }
//Test to confirm hero object is being saved

    @Test
    void SquadSavesHeroDataCorrectly() {
        Hero testHero = new Hero("Eph",21,"positive","none");
        Squad squad = new Squad(5,"Chelsea","Fight crime",testHero);
        assertEquals(testHero,squad.getData());
    }
}










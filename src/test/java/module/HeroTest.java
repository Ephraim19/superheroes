package module;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void testForInstancesOfHero () {
        Hero hero = new Hero("Eph",21,"Positive","None");
        assertEquals(true,hero instanceof Hero);
    }
}
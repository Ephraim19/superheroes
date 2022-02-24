package module;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void testForInstancesOfHero () {
        Hero hero = new Hero("Eph",21,"Positive","None");
        assertEquals(true,hero instanceof Hero);
    }

    @Test
    void checksIfNameGetterMethodReturnsValue() {
        Hero hero = new Hero("Eph",21,"Positive","None");
        assertEquals("Eph",hero.getName());
    }
    @Test
    void checksIfAgeGetterMethodReturnsValue() {
        Hero hero = new Hero("Eph",21,"Positive","None");
        assertEquals(21,hero.getAge());
    }
    @Test
    void checksIfSpecialPowerGetterMethodReturnsValue() {
        Hero hero = new Hero("Eph",21,"Positive","None");
        assertEquals("Positive",hero.getSpecialPower());
    }
    @Test
    void checksIfWeaknessGetterMethodReturnsValue() {
        Hero hero = new Hero("Eph",21,"Positive","None");
        assertEquals("None",hero.getWeakness());
    }
}
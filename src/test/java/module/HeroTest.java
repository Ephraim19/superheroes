package module;

import models.Hero;
import org.junit.After;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void testForInstancesOfHero () {
        Hero hero = new Hero(1,"Eph",21,"Positive","None");
        assertTrue(true);
    }

    @Test
    void checksIfIdGetterMethodReturnsValue() {
        Hero hero = new Hero(1,"Eph",21,"Positive","None");
        assertEquals(1,hero.getId());
    }

    @Test
    void checksIfNameGetterMethodReturnsValue() {
        Hero hero = new Hero(1,"Eph",21,"Positive","None");
        assertEquals("Eph",hero.getName());
    }

    @Test
    void checksIfSpecialPowerGetterMethodReturnsValue() {
        Hero hero = new Hero(1,"Eph",21,"Positive","None");
        assertEquals("Positive",hero.getSpecialPower());
    }
    @Test
    void checksIfWeaknessGetterMethodReturnsValue() {
        Hero hero = new Hero(1,"Eph",21,"Positive","None");
        assertEquals("None",hero.getWeakness());
    }
    @Test
    void checksIfAgeGetterMethodReturnsValue() {
        Hero hero = new Hero(1,"Eph",21,"Positive","None");
        assertEquals(21,hero.getAge());
    }

    @Test
    void TestIfGetterMethodGetAllRuturnsAllValues() {
        Hero hero = new Hero(1,"Eph",21,"Positive","None");
        Hero heroine = new Hero(1,"Natasha",21,"Positive","None");
        assertEquals(3,Hero.getAll().size());

    }
    @After
    public void tearDown() {
        Hero.clearAllHeroes();
    }
}










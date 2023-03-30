import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestHatszogyep {
    Hatszogyep hatszogyep;

    @BeforeEach
    public void init() {
        this.hatszogyep = new Hatszogyep();
    }

    @Test
    public void TestSzamitTerulet() {
        double actual = hatszogyep.szamitHexagon(15);
        assertEquals(actual, 389.71143170299734);
    }

    @Test
    public void TestSzamitTeruletSecond() {
        double actual = hatszogyep.szamitHexagon(42);
        assertEquals(actual, 3055.337624551499);
    }
}

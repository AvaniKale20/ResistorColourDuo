import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class ResistorColorDuoTest {
    private ResistorColorDuo resistorColorDuo;

    @Before
    public void setup() {
        resistorColorDuo = new ResistorColorDuo();
    }

    @Test
    public void givenTwoColours_WhenCheckResistanceValue_ThenShouldReturnOneZero() {
        String[] input = {"brown", "black"};
        int expected = 10;
        int actual = resistorColorDuo.value(input);

        assertEquals(expected, actual);
    }


}

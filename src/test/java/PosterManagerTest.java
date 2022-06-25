import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
    private final String filmOne = "film one";
    private final String filmTwo = "film two";
    private final String filmThree = "film three";
    private final String filmFour = "film four";
    private final String filmFive = "film five";
    private final String filmSix = "film six";

    @Test
    public void additionTest() {
        PosterManager posterManager = new PosterManager();

        posterManager.add(filmOne);
        assertEquals(1, posterManager.findAll().length);
        assertEquals(filmOne, posterManager.findAll()[0]);
    }

    @Test
    public void orderAdditionTest() {
        PosterManager posterManager = new PosterManager();

        posterManager.add(filmOne);
        posterManager.add(filmTwo);
        posterManager.add(filmThree);

        assertEquals(3, posterManager.findAll().length);
        assertEquals(filmOne, posterManager.findAll()[0]);
        assertEquals(filmTwo, posterManager.findAll()[1]);
        assertEquals(filmThree, posterManager.findAll()[2]);
    }

    @Test
    public void shouldRemoveIfExists() {
        PosterManager posterManager = new PosterManager();

        posterManager.add(filmTwo);
        posterManager.add(filmThree);
        posterManager.add(filmFour);
        posterManager.add(filmFive);
        posterManager.add(filmSix);

        assertEquals(5, posterManager.findAll().length);
        assertEquals(filmSix, posterManager.findAll()[4]);
        assertEquals(filmFive, posterManager.findAll()[3]);
        assertEquals(filmFour, posterManager.findAll()[2]);
        assertEquals(filmThree, posterManager.findAll()[1]);
        assertEquals(filmTwo, posterManager.findAll()[0]);
    }
}

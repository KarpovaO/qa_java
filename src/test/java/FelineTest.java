import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void checkFelineEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Список еды не соответствует ожидаемому", expectedFood, feline.eatMeat());
    }

    @Test
    public void checkFelineGetKittens() throws Exception {
        int expectedKittens = 1;
        assertEquals("Количество котят не соответствует ожидаемому", expectedKittens, feline.getKittens());
    }

    @Test
    public void checkFelineGetFamily() throws Exception {
        String expectedFamily = "Кошачьи";
        assertEquals("Семейство не соответствует ожидаемому", expectedFamily, feline.getFamily());
    }
}
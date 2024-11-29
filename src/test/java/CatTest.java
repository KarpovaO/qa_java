import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    private final Cat cat = new Cat(new Feline());

    @Test
    public void checkCatSound() throws Exception {
        String expectedCatSound = "Мяу";
        assertEquals("Звук кота не соответствует ожидаемому", expectedCatSound, cat.getSound());
    }

    @Test
    public void checkCatFood() throws Exception {
        List<String> expectedCatFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Список еды для кота не соответствует ожидаемому", expectedCatFood, cat.getFood());
    }
}
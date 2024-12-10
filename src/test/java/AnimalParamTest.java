import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(org.junit.runners.Parameterized.class)
public class AnimalParamTest {
    @org.junit.runners.Parameterized.Parameters
    public static Object[] getSumData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    public AnimalParamTest(String animalKind, Object expectedResult) {
        this.animalKind = animalKind;
        this.expectedResult = expectedResult;
    }

    private final String animalKind;
    private final Object expectedResult;
    private final Animal animal = new Animal();

    @Test
    public void checkGetFoodHerbivore() throws Exception {
        assertEquals(expectedResult, animal.getFood(animalKind));
    }

    @Test
    public void checkGetFamily() {
        Animal animal_mock = Mockito.mock(Animal.class);
        animal_mock.getFamily();
        Mockito.verify(animal_mock).getFamily();
    }
}
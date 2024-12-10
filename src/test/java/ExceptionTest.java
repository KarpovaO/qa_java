import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ExceptionTest {
    private final Animal animal;

    public ExceptionTest() {
        animal = new Animal();
    }

    @Test
    public void checkGetFoodException() {
        Exception exception = assertThrows(Exception.class, () -> {
            animal.getFood("Непонятно кто");
        });
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

    @Mock
    private Feline feline;
    @Test
    public void checkLionInvalidSexThrowsException() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Непонятно кто", feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
}

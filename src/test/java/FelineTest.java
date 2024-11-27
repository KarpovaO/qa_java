import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private final Feline feline = new Feline();

    @Test
    public void checkFelineEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void checkFelineGetKittens() throws Exception {
        feline.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void checkFelineGetFamily() throws Exception {
        feline.getFamily();
        Mockito.verify(feline).getFamily();
    }
}
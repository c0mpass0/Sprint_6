package ru.yandex.praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionGenericTest {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void lionDoesHasManeReturnException() throws Exception {
        Lion lion = new Lion("Сам", feline);
    }

    @Test
    public void lionGetKittensCallsEmptyGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        lion.getKittens();

        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void lionGetFoodCallsPredator() throws Exception {
        Lion lion = new Lion("Самка", feline);
        lion.getFood();

        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}

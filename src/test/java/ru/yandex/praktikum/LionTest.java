package ru.yandex.praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void lionDoesHasManeReturnTrueIfMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expectedHasMane = true;

        assertEquals("Наличие гривы не совпало" ,expectedHasMane, lion.doesHaveMane());
    }

    @Test
    public void lionDoesHasManeReturnFalseIfFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expectedHasMane = false;

        assertEquals("Наличие гривы не совпало" ,expectedHasMane, lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void lionDoesHasManeReturnException()  throws Exception {
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

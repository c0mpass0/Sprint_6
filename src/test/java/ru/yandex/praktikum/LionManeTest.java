package ru.yandex.praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionManeTest {
    private final String lionSex;
    private final boolean lionMane;
    @Mock
    Feline feline;

    public LionManeTest(String lionSex, boolean lionMane) {
        this.lionSex = lionSex;
        this.lionMane = lionMane;
    }

    @Parameterized.Parameters(name = "Пол льва и ожидаемый ответ наличия гривы. Тестовые данные: {0} {1}")
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionDoesHasManeReturnManeState() throws Exception {
        Lion lion = new Lion(lionSex, feline);

        assertEquals("Наличие гривы не совпало", lionMane, lion.doesHaveMane());
    }
}

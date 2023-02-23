package ru.yandex.praktikum;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Spy;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Spy
    Feline feline = new Feline();

    @Test
    public void catGetSoundReturnMay() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";

        assertEquals("Звук не совпадает", expectedSound, cat.getSound());
    }

    @Test
    public void catGetFoodCallsPredatorFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");

        assertEquals("Вид пищи не совпадает", expectedFood, cat.getFood());
    }
}

package ru.yandex.praktikum;

import com.example.Feline;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {


    @Test
    public void felineEatMeatReturnPredator() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");

        assertEquals("Вид пищи не совпадает", expectedFood, feline.getFood("Хищник"));
    }

    @Test
    public void felineGetFamilyReturnCat() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        assertEquals("Семейство не совпадает", expectedFamily, feline.getFamily());
    }

    @Test
    public void felineGetKittensEmptyReturnOne() {
        Feline feline = new Feline();
        int expectedKittenCount = 1;

        assertEquals("Количество котят не совпадает", expectedKittenCount, feline.getKittens());
    }

    @Test
    public void felineGetKittensSepcifiedReturnSpecified() {
        Feline feline = new Feline();
        int expectedKittenCount = 5;

        assertEquals("Количество котят не совпадает", expectedKittenCount, feline.getKittens(5));
    }
}

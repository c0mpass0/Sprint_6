package ru.yandex.praktikum;

import com.example.Animal;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalGenericTest {

    @Test
    public void animalGetFoodHerbivore() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood = Arrays.asList("Трава", "Различные растения");

        assertEquals("Вид пищи для травоядного не совпадает", expectedFood, animal.getFood("Травоядное"));
    }

    @Test
    public void animalGetFoodPredator() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");

        assertEquals("Вид пищи для хищника не совпадает", expectedFood, animal.getFood("Хищник"));
    }

    @Test(expected = Exception.class)
    public void animalGetFoodReturnException() throws Exception {
        Animal animal = new Animal();
        animal.getFood("");
    }

    @Test
    public void animalGetFamilyReturnFamilyList() {
        Animal animal = new Animal();
        String expectedFamilyList = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        assertEquals("Список семейств не совпадает", expectedFamilyList, animal.getFamily());
    }
}

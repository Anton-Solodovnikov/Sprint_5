package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> mockValue = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Неверный набор пищи", mockValue, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        assertEquals("Неверное семейство", expected, feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int expected = 1;
        assertEquals("Неверное количество котят", expected, feline.getKittens());
    }

    @Test
    public void getSeveralKittensTest() {
        Feline feline = new Feline();
        int expected = 3;
        assertEquals("Неверное количество котят", expected, feline.getKittens(expected));
    }

}
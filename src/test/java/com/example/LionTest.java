package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int mockValue = 1;
        Mockito.when(feline.getKittens()).thenReturn(mockValue);
        assertEquals("Неверное количество котят", mockValue, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> mockValue = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(mockValue);
        assertEquals("Неверный набор пищи", mockValue, lion.getFood());
    }

    @Test
    public void doesHaveManeExceptionTest(){
        String incorrectSex = "Питомец";
        String expectedMassage = "Используйте допустимые значения пола животного - самец или самка";
        String actualExceptMessage = null;
        try {
            Lion lion = new Lion(incorrectSex, feline);
        } catch (Exception exception) {
            actualExceptMessage = exception.getMessage();
        } finally {
            assertEquals("Неверный текст ошибки", expectedMassage, actualExceptMessage);
        }
    }

}
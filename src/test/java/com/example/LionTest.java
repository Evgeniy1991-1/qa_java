package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    private Predator predator;

    @Test
    public void testLionConstructorThrowsExceptionOnInvalidSex() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion(predator, "НедопустимоеЗначение");
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(predator, "Самец");
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы"));
        assertEquals(List.of("Животные", "Птицы"), lion.getFood());
    }
}

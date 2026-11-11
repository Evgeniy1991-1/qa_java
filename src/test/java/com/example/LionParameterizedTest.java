package com.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LionParameterizedTest {

    @Mock
    private Predator predator;

    @ParameterizedTest(name = "Для пола {0} наличие гривы должно быть {1}")
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    public void testLionMane(String sex, boolean expectedHasMane) throws Exception {
        Lion lion = new Lion(predator, sex);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}

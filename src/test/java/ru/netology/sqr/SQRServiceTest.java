package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    SQRService service = new SQRService();

    //Квадраты чисел в диапозоне от 200 до 300
    @Test
    public void sqareTestThreeNumbers() {
        int actualSqare = service.sqare(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actualSqare);
    }

    //Квадраты чисел в диапозоне от 200 до 400
    @Test
    public void sqareTestSixNumbers() {
        int actualSqare = service.sqare(1000, 2000);
        int expected = 13;
        Assertions.assertEquals(expected, actualSqare);
    }

    //Квадраты чисел в диапозоне от 1000 до 10000
    @Test
    public void sqareTestThousands () {
        int actualThousands = service.sqare(1000, 10000);
        int expected = 68;
        Assertions.assertEquals(expected, actualThousands);
    }
}

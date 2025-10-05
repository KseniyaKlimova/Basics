package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldAmountBelow1000() {
        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountAbove1000() {
        int amount = 1300;

        int actual = cashback.remain(amount);
        int expected = 700;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountEqual1000() {
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}

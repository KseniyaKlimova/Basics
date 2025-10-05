package ru.netology.service;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldAmountBelow1000() {
        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountAbove1000() {
        int amount = 1300;

        int actual = cashback.remain(amount);
        int expected = 700;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountEqual1000() {
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

}

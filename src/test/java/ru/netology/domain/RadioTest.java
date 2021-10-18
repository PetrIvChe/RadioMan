package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @Test
    //Граничные значения 0
    public void shouldReturnIncreaseVolume0Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(0);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 10
    public void shouldReturnIncreaseVolume10Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(11);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 0
    public void shouldReturnDecreaseVolume0Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(0);
        currentV.decreaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


}
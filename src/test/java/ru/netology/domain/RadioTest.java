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
        currentV.setCurrentVolume(10);
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
    @Test
    //Максимальная громкость максимальна
    public void shouldReturnMaxVolume10Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(10);
        currentV.maxVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    //Минимальная громкость миниимальна
    public void shouldReturnMinVolume0Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(0);
        currentV.minVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 9
    public void shouldReturnPrevStation9Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(8);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    //Переход от 0 к 9 станции
    public void shouldReturnPrev0StationTest() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(0);
        currentS.prev0Station();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    //Переход от 9 к 0 станции
    public void shouldReturnPrev9StationTest() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(9);
        currentS.prev9Station();
        int actual = currentS.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
}
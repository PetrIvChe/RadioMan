package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @Test
    //Граничные значения -1
    public void shouldReturnIncreaseVolumeMinus1Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(-1);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

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
    //Граничные значения 11
    public void shouldReturnIncreaseVolume11Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(11);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }


    @Test
    //Эквивалентные значения 5
    public void shouldReturnIncreaseVolume5Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(5);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 6;
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
    //Граничные значения 10
    public void shouldReturnDecreaseVolume10Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(10);
        currentV.decreaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 9;
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
    //Максимальная громкость больше максимальной
    public void shouldReturnMaxVolume11Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(11);
        currentV.maxVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    //Максимальная громкость больше максимальной
    public void shouldReturnMaxVolume12Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(12);
        currentV.maxVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    // громкость меньше максимальной
    public void shouldReturnMaxVolume9Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(9);
        currentV.maxVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 9;
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
    //Минимальная громкость меньше миниимальной
    public void shouldReturnMinVolumeMinus1Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(-1);
        currentV.minVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //громкость больше миниимальной
    public void shouldReturnMinVolume2Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(2);
        currentV.minVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    //Следующая станция от 0 до 9
    public void shouldReturnNextStation0Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(0);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Следующая станция от 0 до 9 Граничные значения 9
    public void shouldReturnNextStation9Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(9);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 9
    public void shouldReturnPrevStation9Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(9);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения -1
    public void shouldReturnPrevStationMinus1Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-1);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 10
    public void shouldReturnPrevStation10Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(10);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 0;
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
    //Переход от 1 к 9 станции
    public void shouldReturnPrev1StationTest() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(1);
        currentS.prev0Station();
        int actual = currentS.getCurrentStation();
        int expected = 1;
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

    @Test
    //Переход от 9 к 0 станции
    public void shouldReturnPrevMinus9StationTest() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-9);
        currentS.prev9Station();
        int actual = currentS.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
}
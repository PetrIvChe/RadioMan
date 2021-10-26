package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @Test
    //Граничные значения -10
    public void shouldReturnIncreaseVolumeMinus10Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(-10);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

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
    //Граничные значения 9
    public void shouldReturnIncreaseVolume10Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(9);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 10
    public void shouldReturnIncreaseVolume11Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(10);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 11
    public void shouldReturnIncreaseVolume12Test() {
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
   //Минимальная громкость меньше миниимальной
    public void shouldReturnMinVolumeMinus1Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(-1);
        currentV.decreaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 0;
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
    //Граничные значения 11
    public void shouldReturnDecreaseVolume11Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(11);
        currentV.decreaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //Эквивалентные  значения
    public void shouldReturnDecreaseVolume5Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(5);
        currentV.decreaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

 // Тесты станций


    @Test
    //Следующая станция -11
    public void shouldReturnNextStationMinus11Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-11);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Следующая станция minus 1
    public void shouldReturnNextStationMinus1Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-1);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    // станция  0
    public void shouldReturnNextStation0Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(0);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    //станция 1
    public void shouldReturnNextStation1Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(1);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    //станция 8
    public void shouldReturnNextStation8Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(8);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //станция 9
    public void shouldReturnNextStation9Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(9);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //станция 10
    public void shouldReturnNextStation10Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(10);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //станция 11
    public void shouldReturnNextStation11Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(11);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    //станция от 15
    public void shouldReturnNextStation15Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(15);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    //Следующая станция от 5 к 6
    public void shouldReturnNextStation6Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(5);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }


    @Test
    //   11
    public void shouldReturnPrevStation10Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(11);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    //10
    public void shouldReturnPrevStation8Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(10);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //9
    public void shouldReturnPrevStation7Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(9);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    //5
    public void shouldReturnPrevStation9Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(5);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 1
    public void shouldReturnPrevStationMinus1Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(1);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //0 станция
    public void shouldReturnPrev0StationTest() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(0);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //-1
    public void shouldReturnPrev9StationTest() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-1);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //Переход от 4 к 3 станции
    public void shouldReturnPrevMinus11StationTest() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-11);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
}
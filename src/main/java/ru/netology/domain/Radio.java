package ru.netology.domain;

public class Radio {
    String name;
    private int currentStation;
    private int currentVolume;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    //Метод увеличения звука на 1
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }


    //Метод уменьшения звука на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    //Метод переключения станции next
//Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    //Метод переключения станции prev
//Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }
    //Метод переключения станции prev
    //Номер после 0 радиостанции изменяется на 9
    public void prev0Station() {
        int maxStation = 9;
        if (currentStation == 0) {
            currentStation = maxStation;
        }
    }

    //Номер после 0 радиостанции изменяется на 9
    public void prev9Station() {
        int minStation = 0;
        if (currentStation == 9) {
            currentStation = minStation;
        }
    }
}

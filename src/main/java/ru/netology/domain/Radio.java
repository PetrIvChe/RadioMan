package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume > 10) {
            return;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation > 9) {
            return;
        }
        if (CurrentStation < 0) {
            return;
        }
        this.currentStation = CurrentStation;
    }

    //Метод увеличения звука на 1
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            this.currentVolume = 10;
        }
    }

    //Метод уменьшения звука на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            this.currentVolume = 0;
        }
    }


    //Метод переключения станции next
//Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void nextStation() {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
            return;
        }
        if (currentStation == 9) {
            this.currentStation = currentStation - 9;
        }
    }

    //Метод переключения станции prev
//Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void prevStation() {
        if (currentStation == 0) {
            this.currentStation = currentStation + 9;
            return;
        }
        if (currentStation <= 9) {
            this.currentStation = currentStation - 1;
        }
    }
}



package ru.netology.domain;

public class Radio {
    String name;
    int currentStation;
    int currentVolume;




    //Метод увеличения звука на 1
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    //Метод уменьшения звука на 1
    public void decreaseVolume() {
        if (currentVolume < 0) {
            currentVolume = currentVolume - 1;
        }
    }

    //Метод переключения станции next
    //Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void nextStation() {
        if (currentStation < 0) {
            currentStation = currentStation + 1;
        }
    }

    public void  prevStation() {
        if (currentStation )
    }
}

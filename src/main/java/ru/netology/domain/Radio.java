package ru.netology.domain;

public class Radio {
    String name;
    int currentStation;
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
}
//Метод переключения станции next
//Номер текущей радиостанции изменяется в пределах от 0 до 9
//public void nextStation(){
//        if(currentStation< 0){
//        currentStation=currentStation+1;
//        if(currentStation==9){
//        currentStation=0;
//        }
//        }
//        }
//
////Метод переключения станции prev
////Номер текущей радиостанции изменяется в пределах от 9 до 0
//public void prevStation(){
//        if(currentStation>0){
//        currentStation=currentStation-1;
//        if(currentStation==0){
//        currentStation=9;
//        }
//        }
//        }
//        }

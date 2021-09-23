package ru.netology.domain;

public class Radio {
    private int totalStation = 10;
    private int maxStation = 9;
    private int minStation;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;


    public Radio() {
    }

    public Radio(int totalStation) {
        this.totalStation = totalStation;
    }


    public int getTotalStation() {

        return totalStation;
    }

    public int getMinStation() {

        return minStation;
    }

    public int getMaxStation() {
        maxStation = getTotalStation() - 1;

        return maxStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setTotalStation(int totalStation) {
        if (totalStation < 0) {
            this.totalStation = 10;
            return;
        }
        this.totalStation = totalStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > getMaxStation()) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int setNext() {
        if (currentStation < getMaxStation()) {
            currentStation = currentStation + 1;
            return this.currentStation;
        } else {
            this.currentStation = minStation;
        }
        return this.currentStation;
    }

    public int setPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return this.currentStation;
        } else {
            this.currentStation = getMaxStation();
        }
        return this.currentStation;
    }


    public int getMinVolume() {

        return minVolume;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public int setIncreaseVolume() {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        } else {
            return this.currentVolume;
        }
        return this.currentVolume;
    }


    public int setDecreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        } else {
            return this.currentVolume;
        }
        return this.currentVolume;
    }


}


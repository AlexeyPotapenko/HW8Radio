package ru.netology.domain;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int setNext() {
        if (currentStation < maxStation) {
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
            this.currentStation = maxStation;
        }
        return this.currentStation;
    }


    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = minVolume;

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
        if (currentVolume < 10) {
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


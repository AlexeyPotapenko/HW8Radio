package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Radio {
    private int totalStation = 10;
    private int maxStation;
    private int minStation;
    private int currentStation;


    public int getTotalStation() {
        if (totalStation < 0) {
            return totalStation = 10;
        }
        return totalStation;
    }

    public int getMaxStation() {
        maxStation = getTotalStation() - 1;

        return maxStation;
    }

    public int getCurrentStation() {
        if (currentStation > maxStation) {
            currentStation = maxStation;
            return currentStation;
        }
        if (currentStation < minStation) {
            currentStation = minStation;
            return currentStation;
        }
        return currentStation;
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


    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;


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


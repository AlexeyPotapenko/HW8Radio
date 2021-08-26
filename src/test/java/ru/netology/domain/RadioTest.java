package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void aboveMaxSetNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(rad.getMaxStation());

        rad.setNext();
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    void noAboveMaxSetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation());

        rad.setNext();
        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldNotSetTempAboveMax() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setCurrentStation(rad.getMaxStation() + 10);

        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void shouldNotSetTempDownMin() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setCurrentStation(rad.getMinStation() - 10);

        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void aboveMinSetPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(rad.getMinStation());

        rad.setPrev();
        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void noAboveMinSetPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(rad.getMaxStation());

        rad.setPrev();
        int expected = 8;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void aboveMaxSetIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.getMaxVolume());

        rad.setIncreaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void NoAboveMaxSetIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.getMinVolume());

        rad.setIncreaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void downMinSetDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.getMinVolume());

        rad.setDecreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void noDownMinSetDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.getMaxVolume());

        rad.setDecreaseVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}

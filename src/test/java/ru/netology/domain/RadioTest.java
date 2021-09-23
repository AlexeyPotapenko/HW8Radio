package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void setTotalStationNoDownMin() {
        Radio rad = new Radio(20,19,0,5,
                100,0,50);

        int expected = rad.getMaxStation() + 1;
        int actual = rad.getTotalStation();

        assertEquals(expected, actual);
    }

    @Test
    void setTotalStationDownMin() {
        Radio rad = new Radio(-20,0,0,0,
                100,0,50);


        int expected = 10;
        int actual = rad.getTotalStation();

        assertEquals(expected, actual);
    }


    @Test
    void aboveMaxSetNextStation() {
        Radio rad = new Radio(20,19,0,19,
                100,0,50);


        rad.setNext();
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    void noAboveMaxSetNextStation() {
        Radio rad = new Radio(20,19,0,18,
                100,0,50);

        rad.setNext();
        int expected = 19;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldNotSetTempAboveMax() {
        Radio rad = new Radio(20,19,0,20,
                100,0,50);



        int expected = rad.getMaxStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void shouldNotSetTempDownMin() {
        Radio rad = new Radio(20,19,0,-1,
                100,0,50);

        int expected = rad.getMinStation();
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void aboveMinSetPrevStation() {
        Radio rad = new Radio(20,19,0,0,
                100,0,50);

        rad.setPrev();
        int expected = 19;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void noAboveMinSetPrevStation() {
        Radio rad = new Radio(20,19,0,19,
                100,0,50);


        rad.setPrev();
        int expected = 18;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void aboveMaxSetIncreaseVolume() {
        Radio rad = new Radio(20,19,0,5,
                100,0,100);

        rad.setIncreaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void NoAboveMaxSetIncreaseVolume() {
        Radio rad = new Radio(20,19,0,5,
                100,0,99);

        rad.setIncreaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void downMinSetDecreaseVolume() {
        Radio rad = new Radio(20,19,0,5,
                100,0,0);

        rad.setDecreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void noDownMinSetDecreaseVolume() {
        Radio rad = new Radio(20,19,0,5,
                100,0,1);

        rad.setDecreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}

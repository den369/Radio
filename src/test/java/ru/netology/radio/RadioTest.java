package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class RadioTest {
    Radio radio = new Radio(100, 0, 5, 10, 0, 5);

    @Test
    public void validateChangeFields() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        assertEquals(5,radio.getCurrentRadioStation());
    }

    @Test
    public void changeAfterLastRadioStation() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        radio.pressNextStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        radio.pressPrevStation();
        assertEquals(4, radio.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        radio.pressNextStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        radio.pressPrevStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void afterInitialRadioStation() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        assertEquals(10, radio.getMaxRadioStation());
    }

    @Test
    public void underInitialRadioStation() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        assertEquals(0, radio.getMinRadioStation());
    }

    // тестируем громкость
    @Test
    public void volumeOverMax() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        assertEquals(0, radio.getMinVolume());

    }

    @Test
    public void plusVolume() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        radio.pressPlusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        Radio radio = new Radio (100, 0, 5, 10, 0, 5);
        radio.pressMinusVolume();
        assertEquals(4, radio.getCurrentVolume());
    }
}
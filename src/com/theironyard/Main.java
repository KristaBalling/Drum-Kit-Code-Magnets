package com.theironyard;

public class Main {

    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.snare = false;
        d.playTopHat();
        d.playSnare();

        if (d.snare == true) {
            d.playSnare();
        }
    }
}

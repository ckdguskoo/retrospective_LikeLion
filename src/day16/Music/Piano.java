package day16.Music;

public class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("피아노를 칩니다. 따라딴");
    }

    @Override
    public void tune() {
        System.out.println("피아노를 조율합니다.");
    }

    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.play();
        piano.tune();
    }
}

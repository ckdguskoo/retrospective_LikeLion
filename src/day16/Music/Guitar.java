package day16.Music;

public class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("기타를 연주합니다. 띵띵띵");
    }

    @Override
    public void tune() {
        System.out.println("기타를 조율합니다");
    }

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();
        guitar.tune();
    }
}

package chap04_01_adaptor;

public class Mp3 implements MediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Mp3 파일 실행 : " + fileName);
    }
}

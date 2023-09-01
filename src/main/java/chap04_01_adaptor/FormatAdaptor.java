package chap04_01_adaptor;

// MediaPackage -> MediaPlayer 변환역할
// 특정 클래스를 호출하는 호출 구조를 변환하는 것 (동일한 인터페이스로 변환)
public class FormatAdaptor implements MediaPlayer{

    private MediaPackage media;
    public FormatAdaptor(MediaPackage media) {
        this.media = media;
    }
    @Override
    public void play(String fileName) {
        System.out.println("어댑터 사용한 케이스 : ");
        media.playFile(fileName);
    }
}

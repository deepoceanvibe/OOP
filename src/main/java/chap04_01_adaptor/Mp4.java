package chap04_01_adaptor;

public class Mp4 implements MediaPackage{
    @Override
    public void playFile(String fileName) {
        System.out.println("Mp4 파일 실행 : " + fileName);
    }
}

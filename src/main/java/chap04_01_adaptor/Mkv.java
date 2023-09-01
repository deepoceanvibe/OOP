package chap04_01_adaptor;

public class Mkv implements MediaPackage{
    @Override
    public void playFile(String fileName) {
        System.out.println("MKV파일 실행 : " + fileName);
    }
}

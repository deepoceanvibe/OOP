package chap04_01_adaptor;

public class AdaptorExampleMain {
    public static void main(String[] args) {

        // mp3, mp4, mkv 다 MediaPlayer 형으로 돌리고싶다
        MediaPlayer player = new Mp3();
        player.play("SuperShy.mp3");

        // MediaPlayer 형으로 변환
        player = new FormatAdaptor(new Mp4());
        player.play("ITZY-CAKE MV.mp4");

        player = new FormatAdaptor(new Mkv());
        player.play("충주시홍보맨-ETA.mkv");

    }
}

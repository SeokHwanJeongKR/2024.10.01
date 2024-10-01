public class MusicPlayer3Main {
    public static void main(String[] args) {

        MusicPlayer3 player = new MusicPlayer3();
        //음악 플레이어 켜기
        player.on();
        //볼륨 증가
        player.voulumUp();
        //볼륨 증가
        player.voulumUp();
        //볼륨 감소
        player.voulumDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();

    }
}

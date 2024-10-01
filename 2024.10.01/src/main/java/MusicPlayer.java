public class MusicPlayer {
    public static void main(String[] args) {
        MusicController musicController = new MusicController();

        on(musicController);
        voulumUp(musicController);
        voulumUp(musicController);
        voulumDown(musicController);
        check(musicController);
        off(musicController);

    } static void on(MusicController musicController) {
        musicController.onOff = true;
        System.out.println("음악 플레이어를 시작합니다 메소드");
    } static void off(MusicController musicController) {
        musicController.onOff = false;
        System.out.println("음악 플레이어를 종료합니다 메소드");
    } static void voulumUp(MusicController musicController) {
        musicController.volume++;
        System.out.println("volume 볼륨 증가 후 = " + musicController.volume);
    } static void voulumDown(MusicController musicController) {
        musicController.volume--;
        System.out.println("volume 볼륨 감소 후 = " + musicController.volume);
    } static void check(MusicController musicController) {
        System.out.println("음악 플레이어의 상태 확인 ");
        if (musicController.onOff = true) {
            System.out.println("현재 음악 플레이어 상태 = on , 볼륨 = " + musicController.volume);
        } else {
            System.out.println("현재 음악 플레이어 상태 = off ");
        }
    }
}
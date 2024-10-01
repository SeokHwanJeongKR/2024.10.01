public class MusicPlayer3 {

    int volume = 0;
    boolean isOn = false;


    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다 메소드");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다 메소드");
    }

    void voulumUp() {
        volume++;
        System.out.println("volume 볼륨 증가 후 = " + volume);
    }

    void voulumDown() {
        volume--;
        System.out.println("volume 볼륨 감소 후 = " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어의 상태 확인 ");
        if (isOn == true) {
            System.out.println("현재 음악 플레이어 상태 = on , 볼륨 = " + volume);
        } else {
            System.out.println("현재 음악 플레이어 상태 = off ");
        }
    }

}

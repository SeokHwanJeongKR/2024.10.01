public class MusicPlayer2 {
    public static void main(String[] args) {
        int volume = 0;
        boolean onOff;
        onOff = true;

        if (onOff = true) {
            System.out.println("플레이어를 시작합니다");
        }
        //볼륨 증가
        ++volume;
        System.out.println("volume = " + volume);
        //볼륨 증가
        ++volume;
        System.out.println("volume = " + volume);
        //볼륨 감소
        --volume;
        System.out.println("volume = " + volume);
        //음악 플레이어 상태
        System.out.println("음악 플레이어의 상태 확인");
        if (onOff = true) {
            System.out.println("음악 플레이어 on, 볼륨 = " + volume);
        } else {
            System.out.println("음악 플레이어 오프");
        }

        onOff = false;
        System.out.println("음악 플레이어를 종료합니다");
        //음악 플레이어 끄기

    }

}

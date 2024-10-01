public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;
        dataB.value = 30;

        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataA.value = 20;

        System.out.println("변경 dataA. value = 20 ");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataB.value = 50;
        System.out.println("변경 dataB. value = 50 ");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        /*같은 값이 출력되는 이유 = dataA 와 dataB의 참조 값이 동일 하기 때문이다
        * 왜냐하면 dataB = new Data();를 사용하여 인스턴스를 생성을 안했기 때문에 */
        /*참조형은 인스턴스를 할당하면 좌표를 따라가 클래스 내의 Field의 값을 변경 한다
        * 이러한 이유로 dataB.value = 10이라고 하였을때 Data클래스의 value로 돌아가 값을 바꾼 다음에
        * 출력을 하기 때문에 dataA.value의 값도 10 출력이 된다 반대의 경우도 마찬가지 이다 */
    }
}

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();

        System.out.println("value1 = " + data.value1); //value1 은 초기값을 지정하지 않아 자동으로 0으로 초기화 된다
        System.out.println("value2 = " + data.value2); //value2 는 초기값을 10으로 지정하여 객체를 생성할때 10으로 초기화가 된다.

    }
}

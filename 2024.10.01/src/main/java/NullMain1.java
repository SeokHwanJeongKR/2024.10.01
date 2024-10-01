public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // null 할당
        System.out.println("1 data = " + data );
        data = new Data(); // 멤버 변수(Field)는 인스턴스를 할당 할 때 자동으로 초기화가 된다(참조값 생성)
        System.out.println("1 data = " + data );
        data = null; // null 할당
        System.out.println("1 data = " + data );
    }
}

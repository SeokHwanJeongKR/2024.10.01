public class MethodChange1 {
    public static void main(String[] args) {


        int a = 10;
        System.out.println("메서드 호출 전 a = " + a);
        changePrimitiv(a);
        System.out.println("메서드 호출 후 a = " + a);

    }
    public static void changePrimitiv(int x) {
        x = 20;
        return;
    }
}
/*changePrimitiv 메서드를 호출 했음에도 안되는 이유는 a 라는 변수에 있는 숫자 10 이 x안에 복사가 되고 x = 20; 이라고 할당이 되며
* a는 10인 그상태로 유지가 되며 x의 값만 20으로 바뀐다
* 이것을 만약 바꾸고 싶다면 메서드의 매개변수를 제거를 하고 a = 20이라고 직접적으로 바꿔 주어야 한다 .*/

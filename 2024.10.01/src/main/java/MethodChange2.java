public class MethodChange2 {
    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;

        int a = 10;
        System.out.println("메서드 호출 전 a = " + dataA.value );
       ChangeReference(dataA);
        System.out.println("메서드 호출 후 a = " + dataA.value );

    }
    public static void changePrimitiv(int x) {
        x = 20;

    } public static void ChangeReference(Data datax) {
        datax.value = 20;
    }
}
/**/
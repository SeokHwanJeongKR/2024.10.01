public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1 ",20,100);


        Student student2 = new Student();
        initStudent(student2,"학생2 ",30,90);

        printstudent(student1);
        printstudent(student2);

        System.out.println(student1); //student1 과 student2의 좌표값을 실제로 출력되는 값이 다르다
        System.out.println(student2); //왜냐하면 new Student();를 사용하며 좌표값이 할당되기 때문이다
                                      //student1 과 student2를 인스턴스를 각각 생성했기 때문

        System.out.println("-----------------------------");

        System.out.println("이름 " + student1.name + "나이 " + student1.age + "성적 " + student1.grade);
        System.out.println("이름 " + student2.name + "나이 " + student2.age + "성적 " + student2.grade);



    } static void initStudent(Student student, String name, int age, int grade) {
      student.name = name;
      student.age = age;
      student.grade = grade;


    } static void printstudent(Student student) {
        System.out.println("이름 " + student.name + "나이 " + student.age + "성적 " + student.grade );
    }

}

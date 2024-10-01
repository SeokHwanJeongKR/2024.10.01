public class StudentTest2 {
    public static void main(String[] args) {

        Student student1 = createStudent( "학생1 ", 20, 100);
        Student student2 = createStudent("학생2",16, 70);

        printstudent(student1);
        printstudent(student2);

        System.out.println(student1); //student1 과 student2의 좌표값을 실제로 출력되는 값이 다르다
        System.out.println(student2); //왜냐하면 new Student();를 사용하며 좌표값이 할당되기 때문이다
        //student1 과 student2를 인스턴스를 각각 생성했기 때문

    } static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;

    } static void printstudent(Student student) {
        System.out.println("이름 = " + student.name + " 나이 =  " + student.age + "성적 = " + student.grade );
    }

}

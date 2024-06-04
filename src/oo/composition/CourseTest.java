package oo.composition;

public class CourseTest {

    public static void main(String[] args) {

        Student firstStudent = new Student("Pablo");
        Student secondStudent = new Student("Karen");

        Course firstCourse = new Course("Java");
        Course secondCourse = new Course("React Js");
        Course terciaryCourse = new Course("NodeJs");
        Course fourthCourse = new Course("Figma");
        Course fifthCourse = new Course("Adobe Package");

        firstCourse.addStudent(firstStudent);
        secondCourse.addStudent(firstStudent);
        firstStudent.addCourse(terciaryCourse);

        fourthCourse.addStudent(secondStudent);
        secondStudent.addCourse(fifthCourse);
        secondStudent.addCourse(firstCourse);

        for(Student student: firstCourse.students) {
            System.out.println(terciaryCourse.name);
            System.out.println(student.name);
        }

        Course courseFound = firstStudent.getCourse("Java");

        if(courseFound != null) {
            System.out.println(courseFound.name);
            System.out.println(courseFound.students);
        }
    }
}

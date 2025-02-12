import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private String major;
    private int year;
    private String[] courseList = new String[10];
    private byte maxCredit = 12;
    private int courseCount = 0;

    public Student(String name, String familia, String id, String major,  int year) {
        firstName = name;
        lastName = familia;
        studentId = id;
        this.major = major;
        this.year = year;
    }

    public void addCourse(String course, int credits) {
        if (maxCredit - credits >= 0) {
            maxCredit -= credits;
            courseList[courseCount] = course;
            courseCount++;
        }
    }
    public String getId() {
        return studentId;
    }
    public void getCourses() {
        for (String course : courseList) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }
    public String getNameandFamilia() {
        return firstName + " " + lastName;
    }

}

class Course {
    private String courseName;
    private String professorName;
    private String courseId;
    private Student[] studentList = new Student[100];
    private byte credits;
    private int studentCount = 0;

    public Course(String name, String professorName, String courseId, byte credits) {
        this.courseName = name;
        this.professorName = professorName;
        this.courseId = courseId;
        this.credits = credits;
    }

    public void addStudent(String studentName, String familia, String id, String major, int year) {
        studentList[studentCount] = new Student(studentName, familia, id, major, year);
        studentCount++;
    }

    public void registerStudentForCourse(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                student.addCourse(courseName, credits);
            }
            }
    }
    public void getCoursesStudent(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id) && student != null ) {
                student.getCourses();
            }
        }
    }
    public String getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public byte getCredits() {
        return credits;
    }
    public void getStudents() {
        for (Student student : studentList) {
            if (student != null) {
                System.out.println(student.getNameandFamilia());
            }
        }
    }

}


class Main45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Student");
            System.out.println("2. Add a Course");
            System.out.println("3. Register a Student for a Course");
            System.out.println("4. List All Courses a Student is Enrolled In");
            System.out.println("5. List All Students in a Course");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter major: ");
                    String major = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    students.add(new Student(firstName, lastName, studentId, major, year));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter professor's name: ");
                    String professor = scanner.nextLine();
                    System.out.print("Enter course ID: ");
                    String courseId = scanner.nextLine();
                    System.out.print("Enter credits: ");
                    byte credits = scanner.nextByte();
                    scanner.nextLine();

                    courses.add(new Course(courseName, professor, courseId, credits));
                    System.out.println("Course added successfully.");
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    String sId = scanner.nextLine();
                    System.out.print("Enter course ID: ");
                    String cId = scanner.nextLine();

                    Student student = null;
                    for (Student s : students) {
                        if (s.getId().equals(sId)) {
                            student = s;
                            break;
                        }
                    }

                    Course course = null;
                    for (Course c : courses) {
                        if (c.getCourseId().equals(cId)) {
                            course = c;
                            break;
                        }
                    }

                    if (student != null && course != null) {
                        student.addCourse(course.getCourseName(), course.getCredits());
                        System.out.println("Student registered successfully.");
                    } else {
                        System.out.println("Student or Course not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    String studentIdForCourses = scanner.nextLine();

                    Student foundStudent = null;
                    for (Student s : students) {
                        if (s.getId().equals(studentIdForCourses)) {
                            foundStudent = s;
                            break;
                        }
                    }

                    if (foundStudent != null) {
                        foundStudent.getCourses();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter course ID: ");
                    String courseIdForStudents = scanner.nextLine();

                    Course foundCourse = null;
                    for (Course c : courses) {
                        if (c.getCourseId().equals(courseIdForStudents)) {
                            foundCourse = c;
                            break;
                        }
                    }

                    if (foundCourse != null) {
                        foundCourse.getStudents();
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

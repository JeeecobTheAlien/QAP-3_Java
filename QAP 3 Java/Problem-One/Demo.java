
class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}

class Student extends Person {
    String studentId;
    double gpa;

    public Student(String name, int age, String gender, String studentId, double gpa) {
        super(name, age, gender);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", GPA: " + gpa;
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: " + salary;
    }
}

class CollegeStudent extends Student {
    int year;
    String major;

    public CollegeStudent(String name, int age, String gender, String studentId, double gpa, int year, String major) {
        super(name, age, gender, studentId, gpa);
        this.year = year;
        this.major = major;
    }

    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}

public class Demo {
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
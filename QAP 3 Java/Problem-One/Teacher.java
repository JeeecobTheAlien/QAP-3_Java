// Teacher.java

public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }

    // getSubject
    public String getSubject() {
        return subject;
    }

    // setSubject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // getSalary
    public double getSalary() {
        return salary;
    }

    // setSalary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

package by.lessons.lesson10;

public class Student extends Character{
    private String faculty;

    public Student(String faculty, String name, String lastName) {
        super(name, lastName);
        this.faculty = faculty;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    // Student Constructor, initializes grades property
    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
//    public void addGrade(int grade){...}
//
//    // returns the list of grades
//    public ArrayList<Integer> getGrades(){...}
//
//    // returns the average of the students grades
//    public double getGradeAverage(){...}





}

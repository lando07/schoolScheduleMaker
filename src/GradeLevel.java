import java.util.ArrayList;

public class GradeLevel {
    /**
     * Stores students and all couse entries for that grade level
     */
    int level;

    ArrayList<Student> students;
    ArrayList<CourseEntry> entries;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<CourseEntry> getEntries() {
        return entries;
    }

    public void setEntries(ArrayList<CourseEntry> entries) {
        this.entries = entries;
    }

    public GradeLevel(int level, ArrayList<Student> students, ArrayList<CourseEntry> entries) {
        this.level = level;
        this.students = students;
        this.entries = entries;
    }

}

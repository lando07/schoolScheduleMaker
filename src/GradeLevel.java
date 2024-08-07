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

    public void addStudent(Student s) {
        students.add(s);
    }

    public ArrayList<CourseEntry> getEntries() {
        return entries;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setEntries(ArrayList<CourseEntry> entries) {
        this.entries = entries;
    }

    public void addEntry(CourseEntry c) {
        entries.add(c);
    }

    public void findCourse(String query){
        for(CourseEntry entry : entries){
            if(entry.getCourseName().toLowerCase().contains(query.toLowerCase()) ||
                entry.getCourseCode().equalsIgnoreCase(query)){
                    System.out.println(entry);
                }
        }
    }
    public GradeLevel(int level, ArrayList<Student> students, ArrayList<CourseEntry> entries) {
        this.level = level;
        this.students = students;
        this.entries = entries;
    }

}

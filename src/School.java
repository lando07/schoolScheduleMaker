import java.util.ArrayList;

/**
 * The chonky class that stores everything
 */
public class School {
    /**
     * The gigantamasaurus object where everything is stored in
     */
    ArrayList<GradeLevel> grades;
    /**
     * 
     * @param gradeNum the grade level to search for
     * @return GradeLevel object with the matching gradeNum or null if no GradeLevel with gradeNum exists
     */
    public GradeLevel getGradeLevel(int gradeNum) {
        for (GradeLevel g : grades) {
            if (g.getLevel() == gradeNum) {
                return g;
            }
        }
        return null;
    }

    public ArrayList<GradeLevel> getGrades() {
        return grades;
    }

    public School(ArrayList<GradeLevel> grades) {
        this.grades = grades;
    }

}

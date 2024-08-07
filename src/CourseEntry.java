public class CourseEntry {
    private String courseName;
    private String courseCode;
    private String description;
    private boolean isWholeCredit;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isWholeCredit() {
        return isWholeCredit;
    }

    public void setWholeCredit(boolean isWholeCredit) {
        this.isWholeCredit = isWholeCredit;
    }

    public CourseEntry(String courseCode, String description, boolean isWholeCredit) {
        this.courseCode = courseCode;
        this.description = description;
        this.isWholeCredit = isWholeCredit;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Couse Details:");
        res.append("\n" + courseName);
        res.append("Course Code: " + courseCode);
        res.append("\nCredit amount:" + (isWholeCredit ? "1.0 (Single Semester)" : "0.5 (Entire Year)"));
        res.append("\n\nDescription: ");
        res.append('\n' + description);
        return res.toString();
    }
}

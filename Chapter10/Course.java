package Chapter10;

public class Course {
    // data fields
    private String courseName;
    private int numberOfStudents;
    private String[] students = new String[100];

    // constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // getters and setters
    public String getCourseName() {
        return courseName;
    }    

    public int getNumberOfStudents() {
        return numberOfStudents;
    }   

    public String[] getStudents() {
        return students;
    }

    // methods
    public void addStudent(String studentName){
        students[numberOfStudents] = studentName;
        numberOfStudents++;
    }

    public void dropStudent(String studentName){

    }

    public void clear(){
        
    }

    

    

    
}

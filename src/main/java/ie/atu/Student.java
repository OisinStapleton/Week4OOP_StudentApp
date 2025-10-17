package ie.atu;

public class Student {
    String name, studentID, course;

    public Student(String name, String email, String course){
        this.name = name;
        this.studentID = email;
        this.course = course;
    }

    //Getters
    public String getName(){
        return name;
    }
    public String getEmail(){
        return studentID;
    }
    public String getCourse(){
        return course;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.studentID = email;
    }

    public void setCourse(String course){
        this.course = course;
    }

    // Display in a table like form
    @Override
    public String toString(){
        return "Student{name ='" + name + "', studentID ='" + studentID + "', course ='" + course + "'}";
    }

}

package ie.atu;

public class Student {
    String name, email, course;

    public Student(String name, String email, String course){
        this.name = name;
        this.course = course;
        this.email = email;
    }

    //Getters
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getCourse(){
        return course;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setCourse(String course){
        this.course = course;
    }

    // Display in a table like form
    @Override
    public String toString(){
        return "Student{name ='" + name + "', studentID ='" + email + "', course ='" + course + "'}";
    }

}

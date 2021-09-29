
package linda;


public class Student {
    
    private int id;
    private String name;
    private int mobile;
    private String course;
    
    
    public Student (int ID, String Name, int Mobile, String Course )
    {
        this.id = ID;
        this.name = Name;
        this.mobile = Mobile;
        this.course = Course;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getMobile()
    {
        return mobile;
    }
    
    public String getCourse()
    {
        return course;
    }
    
}

public class Student
{
    private String name;
    private int id;
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public void printd()
    {
        System.out.println("name is : "+this.name+", ID is : "+this.id);
    }
}
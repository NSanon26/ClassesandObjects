public class Student {
    public String name;
    public int age;
public Student(String pName, int pAge){
    name = pName;
    age = pAge;
}
    public void display(){
    System.out.println("The Student's name is " + name + ". " + name + " is " + age + " years old");
    }
}

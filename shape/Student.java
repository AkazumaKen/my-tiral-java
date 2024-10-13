package PersonInteleji;

public class Student {

    private int id;
    private int age;
    private String name;
    private String gender;


    public Student(int id, int age, String name, String gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    public void displayStudentInfo() {
        System.out.println("Id: " + id);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }

}

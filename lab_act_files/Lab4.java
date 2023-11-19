import java.util.Scanner;
class Student{
    private String name;
    private int age;
    private float gpa;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void printStudentInfo() {
        System.out.println("Student's name: " + name);
        System.out.println("Student's age: " + age);
        System.out.println("Student's gpa: " + gpa);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student st = new Student();

        System.out.println("Enter Student's name: ");
        String studName = input.nextLine();
        st.setName(studName);

        System.out.println("Enter Student's age: ");
        int studAge = input.nextInt();
        st.setAge(studAge);

        System.out.println("Enter Student's gpa: ");
        float studGpa = input.nextFloat();
        st.setGpa(studGpa);

        st.printStudentInfo();

        input.close();
    }
}
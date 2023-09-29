interface Role {
    void displayRole();
}

class Person1 implements Role{
    String name, address;
    int age;

    Role role;
    Person1(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }


    @Override
    public void displayRole() {
        role.displayRole();
    }
}

class Student1 extends Person1 {
    int studentID;
    String grade;
    double courseScores[];

    Student1(int studentID, String grade, double courseScores[], Person1 p) {
        super(p.getName(), p.getAge(),p.getAddress());
        this.studentID = studentID;
        this.grade = grade;
        this.courseScores = courseScores;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    double AvgScore() {
        double sum = 0;
        for (double score : courseScores) {
            sum += score;
        }
        return sum / courseScores.length;
    }

    void dispCourseScore(){
        System.out.println("Course scores:");
        for (int i = 0; i < courseScores.length; i++) {
            System.out.print(i+1+")"+courseScores[i]+" ");
        }
        System.out.println();
    }
    void display(){
        System.out.println("Infromation of student: ");
        displayRole();
        System.out.println("Name: "+this.name+", Age: "+this.age+", Student ID: "+this.studentID+", Grade: "+this.grade+", Address: "+this.address);
        System.out.println("Average Score: "+AvgScore());
        dispCourseScore();
    }
}

class Teacher1 extends Person1 {
    int teacherID;
    String coursesTaught[];

    Teacher1(int teacherID, String coursesTaught[], Person1 p) {
        super(p.getName(), p.getAge(),p.getAddress());
        this.teacherID = teacherID;
        this.coursesTaught = coursesTaught;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    void dispCourseThaught(){
        System.out.println("Courses thought:");
        for (int i = 0; i < coursesTaught.length; i++) {
            System.out.print(i+1+")"+coursesTaught[i]+" ");
        }
        System.out.println();
    }

    void display(){
        System.out.println("Infromation of teacher: ");
        displayRole();
        System.out.println("Name: "+this.name+", Age: "+this.age+", Teacher ID: "+this.teacherID+", Address: "+this.address);
        dispCourseThaught();
    }
}

public class T10StudentManagement_interface{
    public static void main(String[] args) {
        Person1 p1 = new Person1("Steve", 22, "Zurich");
        Person1 p2 = new Person1("Zaheed", 45, "Dhaka");

        double []courseScore = {70, 75, 60, 65, 80};
        String []courseTaught = {"Data Structure", "Algorithm", "OOP", "Java", "Operating System"};

        Student1 student = new Student1(2122020043, "A", courseScore, p1);
        Teacher1 teacher = new Teacher1(868745, courseTaught, p2);

        student.display();
        teacher.display();
    }
}

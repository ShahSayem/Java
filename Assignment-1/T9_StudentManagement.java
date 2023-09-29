 class Person{
    String name, address;
    int age;

    Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
}

class Student extends Person{
    String grade;
    int studentID;
    double courseScore[];

    Student(int studentID, String grade, double courseScore[], Person p){
        super(p.getName(), p.getAddress(), p.getAge());
        this.grade = grade;
        this.studentID = studentID;
        this.courseScore = courseScore;
    }

    double AvgScore(){
        double sum = 0;
        for (int i = 0; i < courseScore.length; i++) {
            sum += courseScore[i];
        }

        return (sum/courseScore.length);
    }

    void dispCourseScore(){
        System.out.println("Course scores:");
        for (int i = 0; i < courseScore.length; i++) {
            System.out.print(i+1+")"+courseScore[i]+" ");
        }
        System.out.println();
    }
    void display(){
        System.out.println("Infromation of student: ");
        System.out.println("Name: "+this.name+", Age: "+this.age+", Student ID: "+this.studentID+", Grade: "+this.grade+", Address: "+this.address);
        System.out.println("Average Score: "+AvgScore());
        dispCourseScore();
    }
}

class Teacher extends Person{
    int teacherID;
    String courseTaught[];

    Teacher(int teacherID, String courseTaught[], Person p){
        super(p.getName(), p.getAddress(), p.getAge());
        this.teacherID = teacherID;
        this.courseTaught = courseTaught;
    }

    void dispCourseThaught(){
        System.out.println("Courses thought:");
        for (int i = 0; i < courseTaught.length; i++) {
            System.out.print(i+1+")"+courseTaught[i]+" ");
        }
        System.out.println();
    }

    void display(){
        System.out.println("Infromation of teacher: ");
        System.out.println("Name: "+this.name+", Age: "+this.age+", Teacher ID: "+this.teacherID+", Address: "+this.address);
        dispCourseThaught();
    }
}

public class T9_StudentManagement {
    public static void main(String[] args) {
        Person p1 = new Person("Steve", "Zurich", 22);
        Person p2 = new Person("Zaheed", "Dhaka", 45);

        double courseScore[] = {70, 75, 60, 65, 80};
        String courseTaught[] = {"Data Structure", "Algorithm", "OOP", "Java", "Operating System"};

        Student std = new Student(2122020043, "A", courseScore, p1);
        Teacher t = new Teacher(868745, courseTaught, p2);

        std.display();
        t.display();
    }
}

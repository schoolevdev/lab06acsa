// Main.java
// this lab creates a School object that holds ten students
// and prints their values
// Evin Lodder 2/11/2024
import java.text.DecimalFormat;
public class Main
{
    public static void main (String[] args)
    {
        //create new school of size 10 and add data and print
        System.out.println("Lab06av100 by Evin Lodder");
        int size = 10;
        School bhs = new School(size);
        bhs.addData();
        System.out.println(bhs);
    }
}
class School
{
    private final Student[] students;
    private final int size;
    //creates new school with students initialized with `s` length
    public School (int s)
    {
        students = new Student[s];
        size = s;
    }
    //adds the data necessary for the lab to be complete (why this doesn't take parameters i don't know)
    public void addData()
    {
        //create lists of names ages and gpas
        String[] names = new String[]{"Tom", "Ann", "Bob", "Jan", "Joe", "Sue", "Jay", "Meg", "Art", "Deb"};
        int[] ages = new int[]{21, 34, 18, 45, 27, 19, 30, 38, 40, 35};
        double[] gpas = new double[]{1.685, 3.875, 2.5, 4.0, 2.975, 3.225, 3.65, 2.0, 3.999, 2.125};
        //add new students to the array
        for(int i = 0; i < size; i++) {
            students[i] = new Student(names[i], ages[i], gpas[i]);
        }
    }
    public String toString()
    {
        //creates a list separated by newlines of all the students
        //in the form '{name} {age} {gpa}'
        StringBuilder listStudents = new StringBuilder();
        for (Student stu : students) {
            listStudents.append(stu.getName())
                    .append(" ")
                    .append(stu.getAge())
                    .append(" ")
                    .append(new DecimalFormat("0.0##").format(stu.getGPA()));
            listStudents.append("\n");
        }
        return listStudents.toString();
    }
}


class Student
{
    private final String name;
    private final int age;
    private final double gpa;
    public Student (String n, int a, double g)
    {
        name = n;
        age = a;
        gpa = g;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGPA() { return gpa; }
    public String toString()
    {
        return name + " " + age + " " + gpa + "\n";
    }
}

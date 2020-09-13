package example.ch01.transferobjectpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.tutorialspoint.com/design_pattern/transfer_object_pattern.htm
 */
public class StudentBO {

    //list is working as a database
    List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<>();
        StudentVO student1 = new StudentVO("Robert", 0);
        StudentVO student2 = new StudentVO("John", 1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    // retrieve list of students from the database
    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll NO " + student.getRollNo() + ", updated in the database");
    }
}

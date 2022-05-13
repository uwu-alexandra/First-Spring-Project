package examples.numberOne.Repositories;

import examples.numberOne.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class StudentRepository {

    Set<Student> students = new HashSet<>();

    public Set<Student> getAllStudentsR() {
        return students;
    }

    public void addStudentR(Student student) {students.add(student);}

    public void deleteStudentR(String id) {
        for (Student s : students)
            if (s.getId().equals(id)) students.remove(s);
    }

    public void updateStudentR(String id, Student updateStudent) {
        deleteStudentR(id);
        students.add(updateStudent);
    }

}

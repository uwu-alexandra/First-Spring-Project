package examples.numberOne.Services;

import examples.numberOne.Model.Student;
import examples.numberOne.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Set<Student> getAllStudentsS() {return studentRepository.getAllStudentsR();}

    public void addStudentS(Student student) {studentRepository.addStudentR(student);}

    public void updateStudentS(String id, Student updateStudent) {studentRepository.updateStudentR(id, updateStudent);}

    public void deleteStudentS(String id) {studentRepository.deleteStudentR(id);}
}

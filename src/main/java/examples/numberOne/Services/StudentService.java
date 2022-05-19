package examples.numberOne.Services;

import examples.numberOne.Exceptions.StudentNotFoundException;
import examples.numberOne.Model.Student;
import examples.numberOne.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudentsS() {return studentRepository.findAll();}

    public void addStudentS(Student student) {studentRepository.save(student);}

    public void updateStudentS(Student updateStudent) {studentRepository.save(updateStudent);}

    public void deleteStudentS(String id) {studentRepository.deleteById(id);}

    public void studentExistS(String id) {
        if(!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("EXCEPTION: Student with id " + id + " doesn't exist");
        }
    }


}

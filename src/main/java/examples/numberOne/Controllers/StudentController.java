package examples.numberOne.Controllers;

import examples.numberOne.Model.Student;
import examples.numberOne.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<Student>> getAllStudentsC() {return new ResponseEntity<>(studentService.getAllStudentsS(), HttpStatus.OK);}

    @PostMapping("/addStudent")
    public ResponseEntity<Object> addStudentC(@RequestBody Student student) {
        studentService.addStudentS(student);
        return new ResponseEntity<>("Student with id: " + student.getId() + " was created.", HttpStatus.OK);
    }

    @PutMapping("/updateStudent")
    public ResponseEntity<Object> updateStudentC(@RequestBody Student student) {
        if(studentService.studentExistS(student.getId())) {
            studentService.updateStudentS(student);
            return new ResponseEntity<>("Student with id: " + student.getId() + " was updated.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Student with id: " + student.getId() + " was not found.", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<Object> deleteStudentC(@PathVariable String id) {
        if(studentService.studentExistS(id)) {
            studentService.deleteStudentS(id);
            return new ResponseEntity<>("Student with id: " + id + " was deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Student with id: " + id + " was not found", HttpStatus.NOT_FOUND);
        }
    }

}

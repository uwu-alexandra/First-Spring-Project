package examples.numberOne.Controllers;

import examples.numberOne.Model.Student;
import examples.numberOne.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getAllStudents")
    public Set<Student> getAllStudentsC() {return studentService.getAllStudentsS();}

    @PostMapping("/addStudent")
    public void addStudentC(@RequestBody Student student) {studentService.addStudentS(student);}

    @PutMapping("/updateStudent/{id}")
    public void updateStudentC(@RequestBody Student student, @PathVariable String id) {studentService.updateStudentS(id, student);}

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudentC(@PathVariable String id) {studentService.deleteStudentS(id);}

}

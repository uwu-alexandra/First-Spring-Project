package examples.numberOne.Controllers;

import examples.numberOne.Model.Student;
import examples.numberOne.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudentsC() {return studentService.getAllStudentsS();}

    @PostMapping("/addStudent")
    public void addStudentC(@RequestBody Student student) {studentService.addStudentS(student);}

    @PutMapping("/updateStudent")
    public void updateStudentC(@RequestBody Student student) {studentService.updateStudentS(student);}

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudentC(@PathVariable String id) {studentService.deleteStudentS(id);}

}

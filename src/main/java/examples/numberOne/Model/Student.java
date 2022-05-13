package examples.numberOne.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/*● Adding the @AllArgsConstructor, @NoArgsConstructor and @Data
annotations will provide our class with all the constructor as well as getter,
setter, toString and equals and hashcode methods*/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Studenti", schema = "student")
public class Student {

    @Id
    private String id;
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

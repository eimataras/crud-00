package lt.eimantas.crud.model.dto;
import lombok.Data;
import javax.persistence.*;

@Data //creates getters and setters when compiling
@Entity(name = "department")
public class DepartmentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String depName;

}

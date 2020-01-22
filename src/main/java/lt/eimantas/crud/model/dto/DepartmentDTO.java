package lt.eimantas.crud.model.dto;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data //creates getters and setters when compiling
@Entity(name = "department")
public class DepartmentDTO {
    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dep_name")
    private String depName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private List<EmployeeDTO> employees;
}

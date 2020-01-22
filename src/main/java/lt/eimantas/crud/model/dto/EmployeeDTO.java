package lt.eimantas.crud.model.dto;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data //creates getters and setters when compiling
@Entity(name = "employee")
public class EmployeeDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String surname;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "department_id")
    private Integer departmentId;

    @OneToMany
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private List<SalaryDTO> salary;

}

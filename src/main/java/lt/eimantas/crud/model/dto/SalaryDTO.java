package lt.eimantas.crud.model.dto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data  //creates getters and setters when compiling
@Entity (name = "salary")
public class SalaryDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private Float salary;

    @Column(name = "employee_id")
    private Integer employeeId;

}

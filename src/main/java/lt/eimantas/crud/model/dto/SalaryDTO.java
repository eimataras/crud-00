package lt.eimantas.crud.model.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data  //creates getters and setters when compiling
@Entity (name = "salary")
public class SalaryDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Float salary;
    @NotNull
    private Integer employeeId;

}

package lt.eimantas.crud.model.dto;

import lombok.Data;

import javax.persistence.*;

@Data //creates getters and setters when compiling
@Entity (name = "item")
public class ItemDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String label;
    private Boolean isDone;

    @Column(name = "employee_id")
    private Integer employeeId;

//    @OneToOne
//    @JoinColumn(name = "employee_id", referencedColumnName = "id")
//    private EmployeeDTO employee;
}

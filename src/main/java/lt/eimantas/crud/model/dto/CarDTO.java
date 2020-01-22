package lt.eimantas.crud.model.dto;

import lombok.Data;

import javax.persistence.*;

@Data  //creates getters and setters when compiling
@Entity(name = "company_car")
public class CarDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Integer id;

    private String make;

    private String model;

    private String year_made;



//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)  //mappedBy = "employee",
//    private EmployeeDTO employee;


//    @OneToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "id", referencedColumnName = "employee_id", nullable = false)
//    private EmployeeDTO employee;


//    @OneToOne
//    private EmployeeDTO employee;

}

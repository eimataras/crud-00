package lt.eimantas.crud.model.dto;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data //creates getters and setters when compiling
@Entity (name = "item")
public class ItemDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String label;
    private Boolean isDone;
    private Integer  employeeId;
}

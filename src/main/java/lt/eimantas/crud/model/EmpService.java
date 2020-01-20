package lt.eimantas.crud.model;

import lt.eimantas.crud.model.dto.EmployeeDTO;
import org.springframework.data.repository.CrudRepository;

public interface EmpService extends CrudRepository<EmployeeDTO, Integer> {
}

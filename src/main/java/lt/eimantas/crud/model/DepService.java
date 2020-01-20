package lt.eimantas.crud.model;

import lt.eimantas.crud.model.dto.DepartmentDTO;
import org.springframework.data.repository.CrudRepository;

public interface DepService extends CrudRepository<DepartmentDTO, Integer> {
}

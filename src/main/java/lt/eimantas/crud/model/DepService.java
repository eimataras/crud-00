package lt.eimantas.crud.model;

import lt.eimantas.crud.model.dto.DepartmentDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface DepService extends CrudRepository<DepartmentDTO, Integer> {

}

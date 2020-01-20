package lt.eimantas.crud.model;

import lt.eimantas.crud.model.dto.SalaryDTO;
import org.springframework.data.repository.CrudRepository;

public interface SalService extends CrudRepository<SalaryDTO, Integer> {
}

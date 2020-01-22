package lt.eimantas.crud.model;

import lt.eimantas.crud.model.dto.CarDTO;
import org.springframework.data.repository.CrudRepository;

public interface CarService extends CrudRepository<CarDTO, Integer> {
}

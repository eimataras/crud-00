package lt.eimantas.crud.model;

import lt.eimantas.crud.model.dto.ItemDTO;
import org.springframework.data.repository.CrudRepository;

public interface MainService extends CrudRepository<ItemDTO, Integer> {
}

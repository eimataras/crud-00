package lt.eimantas.crud.controller;

import lt.eimantas.crud.model.MainService;
import lt.eimantas.crud.model.dto.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/to-do")


public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/all")
    public Iterable<ItemDTO> getAll () {
        return mainService.findAll();
    }

    @PostMapping("/add")
    public void addItem(@RequestBody ItemDTO item) {
        mainService.save(item);
    }

    @PutMapping("/edit")
    public void editItem(@RequestBody ItemDTO item) {
        mainService.save(item);
    }

    @DeleteMapping("/delete/(id)")
    public void deleteItem(@RequestParam Integer id) {
        mainService.deleteById(id);
    }
}
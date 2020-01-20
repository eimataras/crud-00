package lt.eimantas.crud.controller;

import io.swagger.v3.core.util.Json;
import lt.eimantas.crud.model.SalService;
import lt.eimantas.crud.model.dto.SalaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/salaries")
       // produces = MediaType.APPLICATION_JSON_VALUE,
        //consumes = MediaType.APPLICATION_JSON_VALUE)
//, produces = "application/json", consumes = "application/json"


public class SalController {


    @Autowired
    SalService salService;

    @GetMapping("/all")
    public Iterable<SalaryDTO> getAllSalaries() {
        return salService.findAll();
    }

    @PostMapping("/add")
    public void addSalary(@RequestBody SalaryDTO salary) {
        salService.save(salary);
    }

    @PutMapping("/update")
    public void editSalary(@RequestBody SalaryDTO salary) {
        salService.save(salary);
    }

    @DeleteMapping("/delete")
    public void deleteSalary(@RequestParam Integer id) {
        salService.deleteById(id);
    }
}
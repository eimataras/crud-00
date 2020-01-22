package lt.eimantas.crud.controller;

import lt.eimantas.crud.model.EmpService;
import lt.eimantas.crud.model.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employees")

public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/all")
    public @ResponseBody Iterable<EmployeeDTO> getAllEmp(){
        return empService.findAll();
    }

    @PostMapping("/add")
    public void addEmp(@RequestBody EmployeeDTO employee) {
        empService.save(employee);
    }

    @PutMapping("/edit")
    public void editEmp(@RequestBody EmployeeDTO employee) {
        empService.save(employee);
    }

    @DeleteMapping("/delete")
    public  void deleteEmp(@RequestParam Integer id) {
        empService.deleteById(id);
    }
}

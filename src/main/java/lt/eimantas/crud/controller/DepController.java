package lt.eimantas.crud.controller;

import lt.eimantas.crud.model.DepService;
import lt.eimantas.crud.model.dto.DepartmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping(value = "/departments")

public class DepController {

    @Autowired
    DepService depService;

    @GetMapping("/all")
    public Iterable<DepartmentDTO> getAllDep () {
        return depService.findAll();
    }

    @GetMapping("/:id")
    public @ResponseBody
    Optional<DepartmentDTO> getOneDepartmentWithEmployees(@RequestParam Integer departmentId){
        Optional<DepartmentDTO> result = depService.findById(departmentId);
        return result;
    }

    @PostMapping("/add")
    public void addDep (@RequestBody DepartmentDTO department) {
        depService.save(department);
    }

    @PutMapping("/edit")
    public void editDep (@RequestBody DepartmentDTO department) {
        depService.save(department);
    }

    @DeleteMapping("/delete")
    public void deleteDep (@RequestParam Integer id) {
        depService.deleteById(id);
    }
}

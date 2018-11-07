package pl.piotr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//@Controller
@RequestMapping("employees")
@RestController
public class EmployeesController {
    //@RequestMapping(value="getEmployees", method = RequestMethod.POST)
    @PostMapping(value = "getEmployees")
    public
    //@ResponseBody
        List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Jan", "Nowak", new BigDecimal("3453.243")));
        list.add(new Employee("Ola", "Kowalczyk", new BigDecimal("7654.80")));
        list.add(new Employee("Karol", "Dłubak", new BigDecimal("2234.54")));
        return list;


    }
   // @RequestMapping(value = "findAny", method = RequestMethod.GET)
    @GetMapping("findAny")
    public Employee findAny() {
        return new Employee("Jan", "Nowak", new BigDecimal("345.67"));
    }

}

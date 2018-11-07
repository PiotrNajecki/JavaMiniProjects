package pl.pathvatiablesspringmvc;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

@RequestMapping(value="companies", produces = (MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE))
//@RequestMapping("${urls.company.root}")
@RestController
public class CompanyController {
    private final CompanyRepository companyRepository;

    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping
    List<Company> findAll(
            Locale locale,
            ZoneId zoneId,
            @CookieValue String my_cookie,
            @RequestHeader Map<String, String> headers

    ) {
        return companyRepository.findAll();
    }

    @GetMapping("{companyName}", produces = MediaType.APPLICATION_XML_VALUE)
    HttpEntity<Company> findOne(@PathVariable("companyName") String name) {
        Company company = companyRepository.findOne(name);
        if (company!=null) {
            return ResponseEntity.ok(company);
        }

        return new ResponseEntity<Company>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("{companyName}/employees/{firstName}")
    List<Employee> findCompanyEmployeesWithFirstName(
            @PathVariable String companyName,
            @PathVariable("firstName") String name) {
        return companyRepository.findOne(companyName)
                .getEmployees()
                .stream()
                .filter(employee -> Objects.equals(employee.getFirstName(), name))
                .collect(Collectors.toList());
    }

    @GetMapping("{companyName}/employees/{employeeId}")
    Employee findCompanyEmployeeWithId(
            @PathVariable String companyName,
            @PathVariable long employeeId
    ) {
        return companyRepository.findOne(companyName)
                .getEmployees()
                .stream()
                .filter(employee -> employee.getId() == employeeId)
                .findAny()
                .orElse(null);
    }

    @GetMapping("{companyName}/employees/{lastName}/{firstName}")
    List<Employee> findCompanyEmployeesWithLastNameAndFirstName(@PathVariable Map<String, String> pathVariable) {
        return companyRepository.findOne(pathVariable.get("companyName"))
                .getEmployees()
                .stream()
                .filter(employee -> Objects.equals(employee.getLastName(), pathVariable.get("lastName")))
                .filter(employee -> Objects.equals(employee.getFirstName(), pathVariable.get("firstName")))
                .collect(Collectors.toList());
    }

    @PostMapping("{companyName}/employees")
    Employee addEmployee(
            @PathVariable String companyName,
            @RequestParam("firstName") String name,
            @RequestParam("lastName") String lastName,
            @RequestParam(value = "salary", required = false) BigDecimal salary
    ) {
        Company original = companyRepository.findOne(companyName);  // z repozytorium pobieramy firme o podanej nazwy
        List<Employee> employees = new ArrayList<>(original.getEmployees());  // pobieramy pracowników z tej listy i zapisujemy do nowej listy
        Employee employee = new Employee(Employee.getNextEmployeeId(), name, lastName, salary);  // nowy pracownik, którego dodamy do tej firmy i parametry
        employees.add(employee);  // dodajemy tutaj nowego pracownika
        Company newCompany = new Company(original.getName(), employees);  // tworzymmy nowa firme, mamy tutaj niemutowalne podejście by nie zmianiac tej nowej firmy
        companyRepository.save(newCompany); // w repozytorium podminiamy na nowa firme
        return employee;   // zwracammy tego nowego pracownika
    }

    @PostMapping("{companyName}/employees/create")
    List<Employee> addEmployees(

            @PathVariable String companyName,
            @RequestBody AddEmployeesRequest request
    ) {

        Company original = companyRepository.findOne(companyName);  // z repozytorium pobieramy firme o podanej nazwy
        List<Employee> employees = new ArrayList<>(original.getEmployees());  // pobieramy pracowników z tej listy i zapisujemy do nowej listy
        List<Employee> newEmployees = createEmplyees(request.getEmployees());
        employees.addAll(createEmplyees(request.getEmployees()));
        Company newCompany = new Company(original.getName(), employees);  // tworzymmy nowa firme, mamy tutaj niemutowalne podejście by nie zmianiac tej nowej firmy
        companyRepository.save(newCompany); // w repozytorium podminiamy na nowa firme
        return newEmployees;   // zwracammy tego nowego pracownika

    }

    private List<Employee> createEmplyees(List<Employee> employees) {
        return employees
                .stream()
                .map(employee -> new Employee(Employee.getNextEmployeeId(), employee.getFirstName(), employee.getLastName(), employee.getSalary()))
                .collect(Collectors.toList());
    }

}

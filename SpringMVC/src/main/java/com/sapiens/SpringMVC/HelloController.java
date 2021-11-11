//package com.sapiens.SpringMVC;
//
//
//import com.sapiens.SpringMVC.productsDemo.model.comapy.CompanyDAO;
//import com.sapiens.SpringMVC.productsDemo.model.comapy.CompanyDetails;
//import com.sapiens.SpringMVC.productsDemo.model.contact.ContactDAO;
//import com.sapiens.SpringMVC.productsDemo.model.contact.ContactDetails;
//import com.sapiens.SpringMVC.productsDemo.model.employee.Employee;
//import com.sapiens.SpringMVC.productsDemo.model.employee.EmployeeDAO;
//import com.sapiens.SpringMVC.productsDemo.model.employee.EmployeeDetails;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import java.net.URI;
//
//@RestController
//@RequestMapping(path = "/")
//public class HelloController {
////    @RequestMapping("/")
////    public String Home(){
////        return "Hello to the Home Page";
////    }
////
////
////    @RequestMapping("/contact")
////    public String Contact(){
////        String firstName="Lozan";
////        String lastName="Masnour";
////        String contactNo="093923";
////        String emailID="lozan@gmail.com";
////
////        return "Full Name: "+firstName+" "+lastName+"/n" +
////                "Contact Number: "+contactNo+" EmailID : "+emailID+"";
////    }
////    @RequestMapping("/about")
////    public String About(){
////        return "Welcome to my company";
////    }
////
////    @RequestMapping("/gallery")
////    public String Gallery(){
////        return "Photo";
////    }
//
//    @Autowired
//    private EmployeeDAO employeeDAO;
//    private ContactDAO contactDAO;
//    private CompanyDAO companyDAO;
//
//    @GetMapping(path = "/employees", produces = "application/json")
//    public EmployeeDetails getEmployees(){
//        return employeeDAO.getAllEmployees();
//    }
//
//    @PostMapping(path = "/employees", consumes = "application/json", produces = "application/json")
//    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
//        Integer id = employeeDAO.getAllEmployees().getEmployeeList().size()+1;
//
//        employee.setId(id);
//
//        employeeDAO.addEmployee(employee);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(employee.getId())
//                .toUri();
//        return ResponseEntity.created(location).build();
//    }
//
//    @GetMapping(path = "/contacts", produces = "application/json")
//    public ContactDetails getContacts(){
//        return contactDAO.getAllContacts();
//    }
//
//    @GetMapping(path = "/companies", produces = "application/json")
//    public CompanyDetails getCompanies(){
//        return companyDAO.getAllCompanies();
//    }
//
//}

package datajpa.controller;

import datajpa.service.EmployeeService;
import datajpa.service.EmployeeServiceIntf;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceIntf empServiceImpl;
    @GetMapping("/findall")
    public ArrayList<EmployeeService> getAllEmployee() {
        return empServiceImpl.findAllEmployee();
    }

}

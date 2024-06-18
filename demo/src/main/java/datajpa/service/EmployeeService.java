package datajpa.service;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeServiceIntf{
    
    @Override
    public ArrayList<EmployeeService> findAllEmployee() {
        return (ArrayList<EmployeeService>) employeeRepository.findAll();
    }
}

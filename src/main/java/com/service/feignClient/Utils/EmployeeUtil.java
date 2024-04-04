package com.service.feignClient.Utils;

import com.service.feignClient.Model.EmployeeModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "http://localhost:8082/employee/",value = "employeeFeign")
public interface EmployeeUtil {

    @GetMapping("/check")
    public String check();

    @GetMapping("/getAll")
    public List<EmployeeModel> getAll();

    @GetMapping("/getById")
    public EmployeeModel getById(@RequestParam long empId);

    @GetMapping("/getByIdTotal")
    public long getByIdTotal(@RequestParam long empId);


}

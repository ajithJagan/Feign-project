package com.service.feignClient.Controller;

import com.service.feignClient.Model.EmployeeModel;
import com.service.feignClient.Utils.EmployeeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/feign")
public class FeignController {


    @Autowired
    private EmployeeUtil employeeUtil;

    @GetMapping("check")
    public String check(){
      return employeeUtil.check();
    }

    @GetMapping("/getAll")
    public List<EmployeeModel> getAll(){
        return employeeUtil.getAll();
    }

    @GetMapping("/getById")
    public EmployeeModel getById(@RequestParam long empId){
        return employeeUtil.getById(empId);
    }
    @GetMapping("/getByIdTotal")
    public long getByIdTotal(@RequestParam long empId){
        return employeeUtil.getByIdTotal(empId);
    }



}

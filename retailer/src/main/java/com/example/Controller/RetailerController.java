package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ServiceImpl.RetailerServiceImpl;
import com.example.model.Rewards;
import org.springframework.web.bind.annotation.PathVariable;



@CrossOrigin
@RestController
@RequestMapping("/api")
public class RetailerController {

    @Autowired
    RetailerServiceImpl retailerService;

   // @Autowired
   // CustomerServiceImpl customerServiceImpl;
    
    @GetMapping(value = "/rewards/{customerId}")
    public Rewards getRewardsByCustomerId(@PathVariable("customerId") Long customerId){
        return    retailerService.getRetailerByCustomerId(customerId);

    }

}
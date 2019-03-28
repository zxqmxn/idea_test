package com.tklims.controller;

import com.tklims.pojo.Cust;
import com.tklims.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cust")
public class CustController {

    @Autowired
    private CustService custService;

    @RequestMapping("/addCust")
    public String addCust(Cust cust) {
        custService.addCust(cust);
        return "ok";
    }
}

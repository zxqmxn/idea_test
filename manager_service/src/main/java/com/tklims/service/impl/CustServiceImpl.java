package com.tklims.service.impl;

import com.tklims.dao.CustMapper;
import com.tklims.pojo.Cust;
import com.tklims.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustServiceImpl implements CustService {
    @Autowired
    private CustMapper custMapper;

    public void addCust(Cust cust) {
        custMapper.insertCust(cust);
    }
}

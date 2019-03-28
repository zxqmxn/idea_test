package com.tklims.dao;

import com.tklims.pojo.Cust;

import java.util.List;

public interface CustMapper {

    void insertCust(Cust cust);

    List<Cust> selectAll();
}

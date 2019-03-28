package com.tklims;

import com.tklims.dao.CustMapper;
import com.tklims.pojo.Cust;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private CustMapper mapper;

    @Test
    public void insertCustTest() {
        Cust cust = new Cust();

        cust.setName("zhangsan");
        cust.setPassword("123456");
        cust.setAdress("tangshan");
        cust.setPhone("15822778368");
        this.mapper.insertCust(cust);

    }

    @Test
    public void selectAll() {
        List<Cust> custs = mapper.selectAll();
        for (Cust cust : custs) {
            System.out.println(cust.getId());
            System.out.println(cust.getName());
            System.out.println(cust.getPassword());
            System.out.println(cust.getAdress());
            System.out.println(cust.getPhone());
            System.out.println("--------------------------");

        }
    }

}

package com.my.service;

import com.my.dao.FinanceDao;
import com.my.vo.Finance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceServiceImpl implements FinanceService{

    @Autowired
    FinanceDao financeDao;

    public List<Finance> queryAllFinance(){
        return financeDao.queryAllFinance();
    }

    public int insertFinance(Finance finance){
        int i=financeDao.insertFinance(finance);
        return i;
    }

    public int updateFinance(Finance finance){
        int i=financeDao.updateFinance(finance);
        return i;
    }

    public Finance queryFinanceById(int fid){
        return financeDao.queryFinanceById(fid);
    }

    public int deleteFinanceById(int fid) {
        int i=financeDao.deleteFinanceById(fid);
        return i;
    }
}

package com.Judy.services.impl;

import com.Judy.dao.DrugDao;
import com.Judy.models.Drug;
import com.Judy.services.DrugService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by urandu on 5/7/15.
 */
public class DrugServiceImpl implements DrugService {

    @Autowired
    DrugDao drugDao;


    @Override
    public int newDrug(Drug drug) {
        return drugDao.newDrug(drug);
    }

    @Override
    public Drug getDrug(int drug_id) {
        return drugDao.getDrug(drug_id);
    }

    @Override
    public List<Drug> getAllDrugs() {
        return drugDao.getAllDrugs();
    }
}

package com.Judy.dao;

import com.Judy.models.Drug;

import java.util.List;

/**
 * Created by urandu on 5/7/15.
 */
public interface DrugDao {
    public int newDrug(Drug drug);
    public Drug getDrug(int drug_id);
    public List<Drug> getAllDrugs();
    //public List<drug> getdrugs(int drug_id);
}

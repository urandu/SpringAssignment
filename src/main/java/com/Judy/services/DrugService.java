package com.Judy.services;

import com.Judy.models.Drug;

import java.util.List;

/**
 * Created by urandu on 5/7/15.
 */
public interface DrugService {



    public int newDrug(Drug drug);
    public Drug getDrug(int drug_id);
    public List<Drug> getAllDrugs();

}

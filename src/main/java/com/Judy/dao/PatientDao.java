package com.Judy.dao;

import com.Judy.models.Patient;

import java.util.List;

/**
 * Created by urandu on 5/7/15.
 */
public interface PatientDao {
    public int newPatient(Patient patient);
    public Patient getPatient(int patient_id);
    public List<Patient> getAllPatients();
    public List<Patient> getPatients(int drug_id);

}

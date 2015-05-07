package com.Judy.services.impl;

import com.Judy.dao.PatientDao;
import com.Judy.models.Patient;
import com.Judy.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by urandu on 5/7/15.
 */
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientDao patientDao;

    @Override
    public int newPatient(Patient patient) {
        return patientDao.newPatient(patient);
    }

    @Override
    public Patient getPatient(int patient_id) {
        return patientDao.getPatient(patient_id);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientDao.getAllPatients();
    }

    @Override
    public List<Patient> getPatients(int drug_id) {
        return patientDao.getPatients(drug_id);
    }
}

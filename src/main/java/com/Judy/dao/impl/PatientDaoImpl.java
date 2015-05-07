package com.Judy.dao.impl;

import com.Judy.dao.PatientDao;
import com.Judy.models.Patient;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by urandu on 5/7/15.
 */
public class PatientDaoImpl implements PatientDao {
    @Autowired
    SessionFactory sessionFactory2;

    @Transactional
    @Override
    public int newPatient(Patient patient) {
        Session session=sessionFactory2.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(patient);
        transaction.commit();
        Serializable id =session.getIdentifier(patient);
        session.close();
        return (Integer) id;



    }

    @Override
    public Patient getPatient(int patient_id) {

        Session session = sessionFactory2.openSession();
        Criteria criteria = session.createCriteria(Patient.class);
        criteria.add(Restrictions.eq("patient_id", patient_id));
        Patient patient = (Patient) criteria.uniqueResult();
        session.close();
        return patient;
    }

    @Override
    public List<Patient> getAllPatients() {
        Session session = sessionFactory2.openSession();
        //@SuppressWarnings("unchecked")
        List<Patient> patientList = session.createQuery("from Patient ").list();
        session.close();
        return patientList;
    }

    @Override
    public List<Patient> getPatients(int drug_id) {
        return null;
    }
}

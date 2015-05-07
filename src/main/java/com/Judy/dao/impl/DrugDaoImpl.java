package com.Judy.dao.impl;

import com.Judy.dao.DrugDao;
import com.Judy.models.Drug;
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
public class DrugDaoImpl implements DrugDao {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int newDrug(Drug drug) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(drug);
        tx.commit();
        Serializable id = session.getIdentifier(drug);
        session.close();
        return (Integer) id;
    }

    @Override
    public Drug getDrug(int drug_id) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Drug.class);
        criteria.add(Restrictions.eq("drug_id", drug_id));
        Drug drug = (Drug) criteria.uniqueResult();
        session.close();
        return drug;
    }

    @Override
    public List<Drug> getAllDrugs() {

        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Drug> drugList = session.createQuery("from Drug ").list();
        session.close();
        return drugList;
    }
}

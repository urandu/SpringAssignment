package com.Judy.models;


import javax.persistence.Entity;
import javax.persistence.*;

/**
 * Created by urandu on 5/7/15.
 */
@Entity
@Table(name="drugs")
public class Drug {

    @Id @GeneratedValue
    @Column(name="drug_id")
    private int drug_id;
    @Column(name = "patient_id")
    private int patient_id;
    @Column(name = "drug_name")
    private String drug_name;

    public int getPatient_id() {
        return patient_id;
    }

    public void setDrug_id(int drug_id) {
        this.drug_id = drug_id;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getDrug_id() {
        return drug_id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

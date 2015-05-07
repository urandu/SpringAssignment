package com.Judy.models;

/**
 * Created by urandu on 5/7/15.
 */

import javax.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {
    @Id @GeneratedValue
    @Column(name = "patient_id")
    private int patient_id;
    @Column(name = "patient_fname")
    private String patient_fname;
    @Column(name = "patient_lname")
    private String patient_lname;
    @Column(name = "patient_email")
    private String patient_email;
    @Column(name = "patient_lname")
    private String patient_dob;




    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_dob(String patient_dob) {
        this.patient_dob = patient_dob;
    }

    public void setPatient_email(String patient_email) {
        this.patient_email = patient_email;
    }

    public void setPatient_fname(String patient_fname) {
        this.patient_fname = patient_fname;
    }

    public void setPatient_lname(String patient_lname) {
        this.patient_lname = patient_lname;
    }

    public String getPatient_dob() {
        return patient_dob;
    }

    public String getPatient_email() {
        return patient_email;
    }

    public String getPatient_fname() {
        return patient_fname;
    }

    public String getPatient_lname() {
        return patient_lname;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Keyu Liu
 */
public class Report {
    public Address address;
    public CheckingAccount checkingaccount;
    public Demographic demographic;
    public Driverlicense driverlicense;
    public MedicalRecord medicalRecord;
    public SavingAccount savingAccount;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CheckingAccount getCheckingaccount() {
        return checkingaccount;
    }

    public void setCheckingaccount(CheckingAccount checkingaccount) {
        this.checkingaccount = checkingaccount;
    }

    public Demographic getDemographic() {
        return demographic;
    }

    public void setDemographic(Demographic demographic) {
        this.demographic = demographic;
    }

    public Driverlicense getDriverlicense() {
        return driverlicense;
    }

    public void setDriverlicense(Driverlicense driverlicense) {
        this.driverlicense = driverlicense;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }
    
    
}

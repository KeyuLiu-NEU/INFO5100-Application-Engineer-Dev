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
public class Patient {
    private String name;
    private String ageGroup;
    private VitalSigns vitalSigns;
    private VitalSignHistory vitalSignHistory;

    public Patient(String name) {
        this.name = name;
    }
      

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(double age) {
        
    
        if(age == 0){
            this.ageGroup = "Newborn";
        }
        if(age> 0 && age< 1){
            this.ageGroup = "Infant";
        }
        if(age>= 1 && age< 3){
            this.ageGroup = "Toddler";
        }
        if(age>= 3 && age<= 5){
            this.ageGroup = "Preschooler";
        }
        if(age>=6 && age<= 12){
            this.ageGroup = "School Age";
        }
        if(age>= 13){
            this.ageGroup = "Adolescent";
        }           
    }
 
    
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    
    public boolean isPatientNormal(){
        if(!this.vitalSigns.isRespiratoryRateNormal(ageGroup))
            System.out.println("Abnormal respiratory rate");
        if(!this.vitalSigns.isHeartRateNormal(ageGroup))
            System.out.println("Abnormal heart rate");
        if(!this.vitalSigns.isBloodPressureNormal(ageGroup))
            System.out.println("Abnormal systolic blood pressure");
        if(!this.vitalSigns.isWeightInKilosNormal(ageGroup))
            System.out.println("Abnormalweight in kilos");
        if(!this.vitalSigns.isWeightInPounds(ageGroup))
            System.out.println("Abnormal weight in pounds");
        else{
            return true;
        }
        return false;
    }
    
    public boolean thisVitalSignNormal(String vsign){
        intervalUtil a = new intervalUtil();
            if(vsign.equals("Respiratory Rate")){
                return vitalSigns.isRespiratoryRateNormal(ageGroup);
                
            }
            if(vsign.equals("Heart Rate")){
                return vitalSigns.isHeartRateNormal(ageGroup);
                
            }
            if(vsign.equals("Systolic Boold Pressure")){
                return vitalSigns.isBloodPressureNormal(ageGroup);
                
            }
            if(vsign.equals("Weight in kilos")){
                return vitalSigns.isWeightInKilosNormal(ageGroup);
                
            }
            if(vsign.equals("Weight in pounds")){
                return vitalSigns.isWeightInPounds(ageGroup);
            }
            else {
                System.out.println("There is no such vitalsign called " +  vsign);
                return false;
            }
        }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }  
    
    public VitalSigns newVitalSign(){
        VitalSigns vs = this.vitalSignHistory.addVitals();
        return vs;
    } 
    
}

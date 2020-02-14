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
public class Main {
    public static void main(String args[]) {
        Patient patient = new Patient("liu");
        VitalSignHistory vitalSignHistory = new VitalSignHistory(patient.getName());
        patient.setVitalSignHistory(vitalSignHistory);
        VitalSigns vitalSigns = new VitalSigns();
        vitalSignHistory.setLatestVitalSigns(vitalSigns);
                
        patient.setAgeGroup(0);
        vitalSigns.setRespiratoryRate(31);
        vitalSigns.setHeartRate(140);
        vitalSigns.setBloodPressure(70);
        vitalSigns.setWeightInKilos(10);
        vitalSigns.setWeightInPounds(4.3);
        
        patient.setVitalSigns(vitalSigns);
   
        System.out.println(patient.isPatientNormal());
        
        VitalSigns vs = patient.newVitalSign();
        vs.setRespiratoryRate(20);
        vs.setHeartRate(70);
        vs.setBloodPressure(110);
        vs.setWeightInKilos(50);
        vs.setWeightInPounds(110);
        
        System.out.println(patient.thisVitalSignNormal("Heart Rate"));
        System.out.println(patient.thisVitalSignNormal("Weight in kilos"));
        System.out.println(patient.thisVitalSignNormal("WeightInKilos"));
        
        for(VitalSigns v : vitalSignHistory.getVitalSignHistory()){
            System.out.println(v.getRespiratoryRate());
            System.out.println(v.getHeartRate());
            System.out.println(v.getBloodPressure());
            System.out.println(v.getWeightInKilos());
            System.out.println(v.getWeightInPounds());
            
        }
            
        
        
        
    }
}

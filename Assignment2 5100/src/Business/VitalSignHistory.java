/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Keyu Liu
 */
public class VitalSignHistory {
    private String patientName;
    private VitalSigns latestVitalSigns;
    private ArrayList<VitalSigns> vitalSignHistory;

    public VitalSignHistory(String patientName) {
        this.patientName = patientName;
        vitalSignHistory = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public VitalSigns getLatestVitalSigns() {
        return latestVitalSigns;
    }

    public void setLatestVitalSigns(VitalSigns latestVitalSigns) {
        this.latestVitalSigns = latestVitalSigns;
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
      public VitalSigns addVitals()
    {
        vitalSignHistory.add(this.getLatestVitalSigns());
        VitalSigns vs = new VitalSigns();
        this.setLatestVitalSigns(vs);
        return vs;
    }
          public void deleteVitals(VitalSigns v)
    {      
        vitalSignHistory.remove(v);
    }
    
}

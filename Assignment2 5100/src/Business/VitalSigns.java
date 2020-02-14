/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import Business.intervalUtil;

/**
 *
 * @author Keyu Liu
 */
public class VitalSigns {
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private int weightInKilos;
    private double weightInPounds;
    private Date date;

    public VitalSigns() {
       this.date = new Date();   
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//        System.out.println(df.format(day));
    }
    
    

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(int weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public Date getDate() {
        return date;
    }
    
    public boolean isRespiratoryRateNormal(String ageGroup){
        intervalUtil a = new intervalUtil();
        while(true){
            if (ageGroup.equals("Newborn")&&a.isInTheInterval(String.valueOf(respiratoryRate), "[30,50]")){
                break;
            }
            if (ageGroup.equals("Infant")&&a.isInTheInterval(String.valueOf(respiratoryRate), "[20,30]")){
                break;
            }
            if (ageGroup.equals("Toddler")&&a.isInTheInterval(String.valueOf(respiratoryRate), "[20,30]")){
                break;
            }
            if (ageGroup.equals("Preschooler")&&a.isInTheInterval(String.valueOf(respiratoryRate), "[20,30]")){
                break;
            }
            if (ageGroup.equals("School Age")&&a.isInTheInterval(String.valueOf(respiratoryRate), "[20,30]")){
                break;
            }
            if(ageGroup.equals("Adolescent")&&a.isInTheInterval(String.valueOf(respiratoryRate), "[12,20]")){
                break;
            }
            else{
                return false;
            }
        }
    return true;
    }
    
    public boolean isHeartRateNormal(String ageGroup){
        intervalUtil a = new intervalUtil();
        while(true){
            if (ageGroup.equals("Newborn")&&a.isInTheInterval(String.valueOf(heartRate), "[120,160]")){
                break;
            }
            if (ageGroup.equals("Infant")&&a.isInTheInterval(String.valueOf(heartRate), "[80,140]")){
                break;
            }
            if (ageGroup.equals("Toddler")&&a.isInTheInterval(String.valueOf(heartRate), "[80,130]")){
                break;
            }
            if (ageGroup.equals("Preschooler")&&a.isInTheInterval(String.valueOf(heartRate), "[80,120]")){
                break;
            }
            if (ageGroup.equals("School Age")&&a.isInTheInterval(String.valueOf(heartRate), "[70,110]")){
                break;
            }
            if(ageGroup.equals("Adolescent")&&a.isInTheInterval(String.valueOf(heartRate), "[55,105]")){
                break;
            }
            else{
                return false;
            }
        }    
    return true;
    }
    public boolean isBloodPressureNormal(String ageGroup){
        intervalUtil a = new intervalUtil();
        while(true){
            if (ageGroup.equals("Newborn")&&a.isInTheInterval(String.valueOf(bloodPressure), "[50,70]")){
                break;
            }
            if (ageGroup.equals("Infant")&&a.isInTheInterval(String.valueOf(bloodPressure), "[70,100]")){
                break;
            }
            if (ageGroup.equals("Toddler")&&a.isInTheInterval(String.valueOf(bloodPressure), "[80,110]")){
                break;
            }
            if (ageGroup.equals("Preschooler")&&a.isInTheInterval(String.valueOf(bloodPressure), "[80,110]")){
                break;
            }
            if (ageGroup.equals("School Age")&&a.isInTheInterval(String.valueOf(bloodPressure), "[80,120]")){
                break;
            }
            if(ageGroup.equals("Adolescent")&&a.isInTheInterval(String.valueOf(bloodPressure), "[110,120]")){
                break;
            }
            else{
                return false;
            }
        }    
    return true;
    }
    public boolean isWeightInKilosNormal(String ageGroup){
        intervalUtil a = new intervalUtil();
        while(true){
            if (ageGroup.equals("Newborn")&&a.isInTheInterval(String.valueOf(weightInKilos), "[2,3]")){
                break;
            }
            if (ageGroup.equals("Infant")&&a.isInTheInterval(String.valueOf(weightInKilos), "[4,10]")){
                break;
            }
            if (ageGroup.equals("Toddler")&&a.isInTheInterval(String.valueOf(weightInKilos), "[10,14]")){
                break;
            }
            if (ageGroup.equals("Preschooler")&&a.isInTheInterval(String.valueOf(weightInKilos), "[14,18]")){
                break;
            }
            if (ageGroup.equals("School Age")&&a.isInTheInterval(String.valueOf(weightInKilos), "[20,42]")){
                break;
            }
            if(ageGroup.equals("Adolescent")&&a.isInTheInterval(String.valueOf(weightInKilos), "(50,+∞]")){
                break;
            }
            else{
                return false;
            }
        }    
    return true;
}
    public boolean isWeightInPounds(String ageGroup){
        intervalUtil a = new intervalUtil();
        while(true){
            if (ageGroup.equals("Newborn")&&a.isInTheInterval(String.valueOf(weightInPounds), "[4.5,7]")){
                break;
            }
            if (ageGroup.equals("Infant")&&a.isInTheInterval(String.valueOf(weightInPounds), "[9,22]")){
                break;
            }
            if (ageGroup.equals("Toddler")&&a.isInTheInterval(String.valueOf(weightInPounds), "[22,31]")){
                break;
            }
            if (ageGroup.equals("Preschooler")&&a.isInTheInterval(String.valueOf(weightInPounds), "[31,40]")){
                break;
            }
            if (ageGroup.equals("School Age")&&a.isInTheInterval(String.valueOf(weightInPounds), "[41,92]")){
                break;
            }
            if(ageGroup.equals("Adolescent")&&a.isInTheInterval(String.valueOf(weightInPounds), "(110,+∞]")){
                break;
            }
            else{
                return false;
            }
        }    
    return true;
    }    
}

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
public class MedicalRecord {
    //Medical Record: Medical record number, Alergy1, Alergy2, Alergy3
    private int recordNum;
    private String Alergy1;
    private String Alergy2;
    private String Alergy3;

    public int getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(int recordNum) {
        this.recordNum = recordNum;
    }

    public String getAlergy1() {
        return Alergy1;
    }

    public void setAlergy1(String Alergy1) {
        this.Alergy1 = Alergy1;
    }

    public String getAlergy2() {
        return Alergy2;
    }

    public void setAlergy2(String Alergy2) {
        this.Alergy2 = Alergy2;
    }

    public String getAlergy3() {
        return Alergy3;
    }

    public void setAlergy3(String Alergy3) {
        this.Alergy3 = Alergy3;
    }
    
    
}

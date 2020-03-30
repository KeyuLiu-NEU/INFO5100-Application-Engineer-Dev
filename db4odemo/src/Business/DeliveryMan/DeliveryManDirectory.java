/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Keyu Liu
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> DeliveryManList;

    public DeliveryManDirectory() {
        DeliveryManList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return DeliveryManList;
    }
    
    public DeliveryMan createDeliveryMan(String name){
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setName(name);
        DeliveryManList.add(deliveryMan);
        return deliveryMan;
    }
    
}

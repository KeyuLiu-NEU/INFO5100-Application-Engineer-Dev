/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author Keyu Liu
 */
public class Menu {
    private ArrayList<Dish> dishList;

    public Menu() {
        dishList = new ArrayList<Dish>();
        System.out.print("ss");
    }

    public ArrayList<Dish> getDishList() {
        return dishList;
    }
}

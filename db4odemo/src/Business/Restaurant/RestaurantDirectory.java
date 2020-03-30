/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> RestaurantList;

    public RestaurantDirectory() {
        RestaurantList = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return RestaurantList;
    }
    
    public Restaurant createRestaurant(String name){
        Restaurant restaurant = new Restaurant();
        restaurant.setName(name);
        RestaurantList.add(restaurant);
        return restaurant;
    }
    
    public void deleteRestaurant(Restaurant name){
        RestaurantList.remove(name);
    }
    
}

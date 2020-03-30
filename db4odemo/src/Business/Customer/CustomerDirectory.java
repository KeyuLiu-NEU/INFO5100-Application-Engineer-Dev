/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {

    private ArrayList<Customer> CustomerList;
    public CustomerDirectory() {
        CustomerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return CustomerList;
    }
    
    public Customer createCustomer(String name){
        Customer customer = new Customer();
        customer.setName(name);
        CustomerList.add(customer);
        return customer;
    }
}
    

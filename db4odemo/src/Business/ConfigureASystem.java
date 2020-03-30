package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Employee employee1 = system.getEmployeeDirectory().createEmployee("customer1");
        Employee employee2 = system.getEmployeeDirectory().createEmployee("deliverMan1");
        Employee employee3 = system.getEmployeeDirectory().createEmployee("restaurantAdmin1");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ca = system.getUserAccountDirectory().createUserAccount("cus", "cus", employee1, new CustomerRole());
        UserAccount da = system.getUserAccountDirectory().createUserAccount("del", "del", employee2, new DeliverManRole());
        UserAccount aa = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee3, new AdminRole());

        
        return system;
    }
    
}

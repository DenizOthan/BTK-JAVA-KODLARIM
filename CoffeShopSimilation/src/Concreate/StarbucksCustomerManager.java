package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    private CustomerCheckService customerCheckService;

    @Override
    public void Save(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.Save(customer);
        } else {
            System.out.println("NOT A VALİD PERSON");
        }
    }
}

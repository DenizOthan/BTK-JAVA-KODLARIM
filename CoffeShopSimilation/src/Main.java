import Abstract.BaseCustomerManager;
import Adapters.MerniceServerAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
        BaseCustomerManager starbuckCustomerManager = new StarbucksCustomerManager(new MerniceServerAdapter());
        Customer deniz = new Customer();
        deniz.setId(1);
        deniz.setFirstName("Deniz");
        deniz.setLastName("Othan");
        deniz.setNationalityId("11879569130");
        deniz.setDateOfBirth(LocalDate.of(2000,5,19));
        Customer ali=new Customer();
        ali.setId(2);
        ali.setFirstName("Ali");
        ali.setLastName("Yıldız");
        ali.setNationalityId("22466339678");
        ali.setDateOfBirth(LocalDate.of(2000,01,9));
        neroCustomerManager.Save(deniz);
        starbuckCustomerManager.Save(ali);


    }
}

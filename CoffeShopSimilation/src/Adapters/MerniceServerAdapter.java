package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.SDOKPSPublicSoap;

public class MerniceServerAdapter implements CustomerCheckService {
    SDOKPSPublicSoap sdokpsPublicSoap = new SDOKPSPublicSoap();
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        try {
            return sdokpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

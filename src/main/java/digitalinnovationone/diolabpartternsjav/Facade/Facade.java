package digitalinnovationone.diolabpartternsjav.Facade;

import Subsystem1.crm.CrmService;
import Subsystem2.zipcode.ZipcodeApi;

public class Facade {

    public void clientMigration(String name, String zipcode) {
        String city = ZipcodeApi.getInstance().cityRecovery(zipcode);
        String state = ZipcodeApi.getInstance().stateRecovery(zipcode);

        CrmService.saveClient(name, zipcode, city,state);

    }
}

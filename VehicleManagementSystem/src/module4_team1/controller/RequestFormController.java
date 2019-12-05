package module4_team1.controller;


import module4_team1.CustomerRequestForm;
import module4_team1.DealerDetails;
import module4_team1.VehicleDetails;
import module4_team1.dao.CustomerTableDao;
import module4_team1.dao.DealerTableDao;
import module4_team1.dao.LeadTableDao;
import module4_team1.dao.VehicleTableDao;

public class RequestFormController {
    private final VehicleTableDao vehicleTableDao;
    private final DealerTableDao dealerTableDao;
    private final CustomerTableDao customerTableDao;
    private final LeadTableDao leadTableDao;

    public RequestFormController(VehicleTableDao vehicleTableDao, DealerTableDao dealerTableDao, CustomerTableDao customerTableDao, LeadTableDao leadTableDao) {
        this.vehicleTableDao = vehicleTableDao;
        this.dealerTableDao = dealerTableDao;
        this.customerTableDao = customerTableDao;
        this.leadTableDao = leadTableDao;
    }


    public CustomerRequestForm createRequestForm(String carId, String dealerId) {
        VehicleDetails vehicleDetails = vehicleTableDao.getVehicleDetails(carId);
        DealerDetails dealerDetails = dealerTableDao.getDealerDetails(dealerId);

        return new CustomerRequestForm.RequestFormBuilder()
                .withCarDetails(vehicleDetails)
                .withDealerDetails(dealerDetails)
                .withInterestedPeopleCount(vehicleDetails.getInterestedPeopleCount())
                .withRequestFormController(this)
                .build();
    }
}